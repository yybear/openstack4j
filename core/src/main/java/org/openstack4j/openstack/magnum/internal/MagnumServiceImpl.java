package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.Apis;
import org.openstack4j.api.magnum.*;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class MagnumServiceImpl extends BaseOpenStackService implements MagnumService {
    @Override
    public BayModelService bayModels() {
        return Apis.get(BayModelService.class);
    }

    @Override
    public BayService bays() {
        return Apis.get(BayService.class);
    }

    @Override
    public PodService pods() {
        return Apis.get(PodService.class);
    }

    @Override
    public CoeServiceService coeServices() {
        return Apis.get(CoeServiceService.class);
    }

    @Override
    public ReplicationControllerService replicationControllers() {
        return Apis.get(ReplicationControllerService.class);
    }

    @Override
    public ContainerService containers() {
        return Apis.get(ContainerService.class);
    }
}
