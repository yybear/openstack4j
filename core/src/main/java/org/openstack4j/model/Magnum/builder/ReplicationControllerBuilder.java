package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.magnum.ReplicationController;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public interface ReplicationControllerBuilder extends Buildable.Builder<ReplicationControllerBuilder, ReplicationController> {
    ReplicationControllerBuilder manifestUrl(String manifestUrl);

    ReplicationControllerBuilder manifest(String manifest);

    ReplicationControllerBuilder bayId(String bayId);
}
