package org.openstack4j.api.magnum;

import org.openstack4j.common.RestService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Bay;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayService extends RestService {
    List<? extends Bay> list();

    Bay get(String id);

    Bay getByName(String name);

    Bay create(Bay bay);

    ActionResponse delete(String id);
}
