package org.openstack4j.api.magnum;

import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Pod;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface PodService {
    List<Pod> list();

    Pod get(String id);

    Pod getByName(String name);

    Pod create(Pod pod);

    ActionResponse delete(String id);
}
