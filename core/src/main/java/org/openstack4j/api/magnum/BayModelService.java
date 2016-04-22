package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.BayModel;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayModelService extends RestService {

    List<? extends BayModel> list();

    BayModel get(String id);

    BayModel getByName(String name);

    BayModel create(BayModel bayModel);

    ActionResponse delete(String id);

    BayModel patch(String id, List<Map<String, Object>> attributes);
}
