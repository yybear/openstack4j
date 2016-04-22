package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.CoeServiceService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.CoeService;
import org.openstack4j.openstack.magnum.domain.MagnumCoeService;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class CoeServiceServiceImpl extends BaseMagnumServices implements CoeServiceService {

    @Override
    public List<? extends CoeService> list() {
        return get(MagnumCoeService.CoeServices.class, "/services").execute().getList();
    }

    @Override
    public CoeService get(String id) {
        checkNotNull(id);
        return get(MagnumCoeService.class, uri("/services/%s", id)).execute();
    }

    @Override
    public CoeService getByName(String name) {
        checkNotNull(name);
        return get(MagnumCoeService.class, uri("/services")).param("name", name).execute();
    }

    @Override
    public CoeService create(CoeService coeService) {
        return post(MagnumCoeService.class, "/services").entity(coeService).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse("/services", id).execute();
    }
}
