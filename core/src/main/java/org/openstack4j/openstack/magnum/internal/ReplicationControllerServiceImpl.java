package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.ReplicationControllerService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Pod;
import org.openstack4j.model.magnum.ReplicationController;
import org.openstack4j.openstack.magnum.domain.MagnumReplicationController;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class ReplicationControllerServiceImpl extends BaseMagnumServices implements ReplicationControllerService {
    @Override
    public List<? extends ReplicationController> list() {
        return get(MagnumReplicationController.ReplicationControllers.class, "/rcs").execute().getList();
    }

    @Override
    public ReplicationController get(String id) {
        checkNotNull(id);
        return get(MagnumReplicationController.class, uri("/rcs/%s", id)).execute();
    }

    @Override
    public ReplicationController getByName(String name) {
        checkNotNull(name);
        return get(MagnumReplicationController.class, uri("/rcs")).param("name", name).execute();
    }

    @Override
    public ReplicationController create(Pod pod) {
        return post(MagnumReplicationController.class, "/rcs").entity(pod).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse("/rcs", id).execute();
    }
}
