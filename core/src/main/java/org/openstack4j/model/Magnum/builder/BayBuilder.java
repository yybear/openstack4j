package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.magnum.Bay;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayBuilder extends Buildable.Builder<BayBuilder, Bay> {
    BayBuilder name(String name);

    BayBuilder baymodelId(String baymodelId);

    BayBuilder nodeCount(Integer nodeCount);

    BayBuilder masterCount(Integer masterCount);

    BayBuilder bayCreateTimeout(Integer bayCreateTimeout);

    BayBuilder discoveryUrl(String discoveryUrl);
}
