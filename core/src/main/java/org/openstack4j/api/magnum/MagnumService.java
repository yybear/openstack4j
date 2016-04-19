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
}
