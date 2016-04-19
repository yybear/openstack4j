package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.types.ServiceType;
import org.openstack4j.openstack.common.functions.EnforceVersionToURL;
import org.openstack4j.openstack.internal.BaseOpenStackService;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class BaseMagnumServices extends BaseOpenStackService {

    protected BaseMagnumServices() {
        super(ServiceType.MAGNUM, EnforceVersionToURL.instance("/v1", true));
    }
}
