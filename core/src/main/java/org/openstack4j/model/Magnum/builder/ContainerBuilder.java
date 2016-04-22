package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.magnum.Container;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public interface ContainerBuilder extends Buildable.Builder<ContainerBuilder, Container> {
    ContainerBuilder name(String name);

    ContainerBuilder image(String image);

    ContainerBuilder command(String command);

    ContainerBuilder bayId(String bayId);

    ContainerBuilder memory(String memory);
}
