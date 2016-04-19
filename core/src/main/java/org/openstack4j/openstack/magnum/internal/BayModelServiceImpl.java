package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.BayModelService;
import org.openstack4j.model.magnum.BayModel;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class BayModelServiceImpl extends BaseMagnumServices implements BayModelService {
    @Override
    public List<BayModel> list() {
        return null;
    }

    @Override
    public BayModel get(String id) {
        checkNotNull(id);
        return get(BayModel.class, uri("/baymodels/%s", id)).execute();
    }
}
