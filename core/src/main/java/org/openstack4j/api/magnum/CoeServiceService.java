package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.CoeService;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface CoeServiceService extends RestService {
    List<? extends CoeService> list();

    CoeService get(String id);

    CoeService getByName(String name);

    CoeService create(CoeService service);

    ActionResponse delete(String id);
}
