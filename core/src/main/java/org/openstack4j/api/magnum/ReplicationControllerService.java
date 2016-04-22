package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Pod;
import org.openstack4j.model.magnum.ReplicationController;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface ReplicationControllerService extends RestService {
    List<? extends ReplicationController> list();

    ReplicationController get(String id);

    ReplicationController getByName(String name);

    ReplicationController create(Pod pod);

    ActionResponse delete(String id);
}
