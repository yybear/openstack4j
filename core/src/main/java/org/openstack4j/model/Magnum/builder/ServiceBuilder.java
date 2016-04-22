package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.magnum.CoeService;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public interface ServiceBuilder extends Buildable.Builder<ServiceBuilder, CoeService>{
    ServiceBuilder manifestUrl(String manifestUrl);

    ServiceBuilder manifest(String manifest);

    ServiceBuilder bayId(String bayId);
}
