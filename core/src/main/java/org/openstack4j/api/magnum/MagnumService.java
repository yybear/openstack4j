package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface MagnumService extends RestService {

    /**
     * BayModel Service API
     *
     * @return the bayModel service
     */
    BayModelService bayModels();

    /**
     * Bay Service API
     *
     * @return the bay service
     */
    BayService bays();

    /**
     * Pod Service API
     *
     * @return the pod service
     */
    PodService pods();

    /**
     * Coe Service Service API
     *
     * @return the coe service service
     */
    CoeServiceService coeServices();

    /**
     * Replication Controllers Service API
     *
     * @return the replication controller service
     */
    ReplicationControllerService replicationControllers();

    /**
     * Pod Service API
     *
     * @return the pod service
     */
    ContainerService containers();
}
