package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.magnum.BayModel;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayModelService extends RestService {

    List<BayModel> list();

    BayModel get(String id);

}
