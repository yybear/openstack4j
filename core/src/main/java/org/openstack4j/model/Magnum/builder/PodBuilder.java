package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.magnum.Pod;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/21.
 */
public interface PodBuilder extends Buildable.Builder<PodBuilder, Pod>  {
    PodBuilder manifestUrl(String manifestUrl);

    PodBuilder manifest(String manifest);

    PodBuilder bayId(String bayId);
}
