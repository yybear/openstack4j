package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.magnum.BayModelService;
import org.openstack4j.api.magnum.MagnumService;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class MagnumServiceImpl extends BaseOpenStackService implements MagnumService {
    @Override
    public BayModelService bayModels() {
        return Apis.get(BayModelService.class);
    }
}
