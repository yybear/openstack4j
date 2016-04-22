package org.openstack4j.openstack.magnum.internal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import org.openstack4j.api.magnum.BayModelService;
import org.openstack4j.core.transport.ObjectMapperSingleton;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.BayModel;
import org.openstack4j.openstack.magnum.domain.MagnumBayModel;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class BayModelServiceImpl extends BaseMagnumServices implements BayModelService {
    static final String PATH_BAYMODELS = "/baymodels";
    @Override
    public List<? extends BayModel> list() {
        return get(MagnumBayModel.BayModels.class, PATH_BAYMODELS).execute().getList();
    }

    @Override
    public BayModel get(String id) {
        checkNotNull(id);
        return get(MagnumBayModel.class, uri(PATH_BAYMODELS+"/%s", id)).execute();
    }

    @Override
    public BayModel getByName(String name) {
        checkNotNull(name);
        return get(MagnumBayModel.class, uri(PATH_BAYMODELS)).param("name", name).execute();
    }

    @Override
    public BayModel create(BayModel bayModel) {
        checkNotNull(bayModel);
        return post(MagnumBayModel.class, PATH_BAYMODELS)
                .entity(bayModel.toBuilder().build()).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(PATH_BAYMODELS, "/", id).execute();
    }

    @Override
    public BayModel patch(String id, List<Map<String, Object>> attributes) {
        checkNotNull(attributes);
        ObjectMapper objectMapper = ObjectMapperSingleton.getContext(Object.class);
        String patch;
        try {
            patch = objectMapper.writeValueAsString(attributes);
        } catch (JsonProcessingException e) {
            throw new RuntimeJsonMappingException(e.getMessage());
        }

        return patch(MagnumBayModel.class, uri(PATH_BAYMODELS+"/%s", id)).entity(patch).execute();
    }
}
