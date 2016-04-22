package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Container;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface ContainerService extends RestService {
    List<? extends Container> list();

    Container get(String id);

    Container getByName(String name);

    Container create(Container service);

    ActionResponse delete(String id);

    ActionResponse start(String id);

    ActionResponse stop(String id);

    ActionResponse reboot(String id);

    ActionResponse pause(String id);

    ActionResponse unpause(String id);

    ActionResponse logs(String id);

    ActionResponse execute(String id, String command);
}
