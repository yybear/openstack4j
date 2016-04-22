package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.ContainerService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Container;
import org.openstack4j.openstack.magnum.domain.MagnumContainer;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class ContainerServiceImpl extends BaseMagnumServices implements ContainerService {
    @Override
    public List<? extends Container> list() {
        return get(MagnumContainer.Containers.class, "/containers").execute().getList();
    }

    @Override
    public Container get(String id) {
        checkNotNull(id);
        return get(MagnumContainer.class, uri("/containers/%s", id)).execute();
    }

    @Override
    public Container getByName(String name) {
        checkNotNull(name);
        return get(MagnumContainer.class, uri("/containers")).param("name", name).execute();
    }

    @Override
    public Container create(Container service) {
        return post(MagnumContainer.class, "/containers").entity(service).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse("/containers", id).execute();
    }

    @Override
    public ActionResponse start(String id) {
        checkNotNull(id);
        return put(ActionResponse.class, uri("/containers/%s/start", id)).execute();
    }

    @Override
    public ActionResponse stop(String id) {
        checkNotNull(id);
        return put(ActionResponse.class, uri("/containers/%s/stop", id)).execute();
    }

    @Override
    public ActionResponse reboot(String id) {
        checkNotNull(id);
        return put(ActionResponse.class, uri("/containers/%s/reboot", id)).execute();
    }

    @Override
    public ActionResponse pause(String id) {
        checkNotNull(id);
        return put(ActionResponse.class, uri("/containers/%s/pause", id)).execute();
    }

    @Override
    public ActionResponse unpause(String id) {
        checkNotNull(id);
        return put(ActionResponse.class, uri("/containers/%s/unpause", id)).execute();
    }

    @Override
    public ActionResponse logs(String id) {
        checkNotNull(id);
        return get(ActionResponse.class, uri("/containers/%s/logs", id)).execute();
    }

    @Override
    public ActionResponse execute(String id, String command) {
        checkNotNull(id, command);
        return put(ActionResponse.class, uri("/containers/%s/execute?command=%s", id, command)).execute();
    }
}
