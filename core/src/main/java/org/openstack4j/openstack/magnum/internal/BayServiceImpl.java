package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.BayService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Bay;
import org.openstack4j.openstack.magnum.domain.MagnumBay;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class BayServiceImpl extends BaseMagnumServices implements BayService {

    static final String PATH_BAYS = "/bays";
    @Override
    public List<? extends Bay> list() {
        return get(MagnumBay.Bays.class, PATH_BAYS).execute().getList();
    }

    @Override
    public Bay get(String id) {
        checkNotNull(id);
        return get(MagnumBay.class, uri(PATH_BAYS+"/%s", id)).execute();
    }

    @Override
    public Bay getByName(String name) {
        checkNotNull(name);
        return get(MagnumBay.class, uri(PATH_BAYS)).param("name", name).execute();
    }

    @Override
    public Bay create(Bay bay) {
        checkNotNull(bay);
        return post(MagnumBay.class, PATH_BAYS)
                .entity(bay.toBuilder().build()).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse(PATH_BAYS, "/", id).execute();
    }
}
