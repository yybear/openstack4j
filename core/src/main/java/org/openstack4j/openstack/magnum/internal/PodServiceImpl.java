package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.PodService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Pod;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class PodServiceImpl extends MagnumServiceImpl implements PodService {
    @Override
    public List<Pod> list() {
        return null;
    }

    @Override
    public Pod get(String id) {
        return null;
    }

    @Override
    public Pod getByName(String name) {
        return null;
    }

    @Override
    public Pod create(Pod pod) {
        // generate manifest from pod object
        return null;
    }

    @Override
    public ActionResponse delete(String id) {
        return null;
    }
}
