package org.openstack4j.openstack.magnum.internal;

import org.openstack4j.api.magnum.PodService;
import org.openstack4j.model.common.ActionResponse;
import org.openstack4j.model.magnum.Pod;
import org.openstack4j.openstack.magnum.domain.MagnumPod;

import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class PodServiceImpl extends BaseMagnumServices implements PodService {
    @Override
    public List<? extends Pod> list() {
        return get(MagnumPod.Pods.class, "/pods").execute().getList();
    }

    @Override
    public Pod get(String id) {
        checkNotNull(id);
        return get(MagnumPod.class, uri("/pods/%s", id)).execute();
    }

    @Override
    public Pod getByName(String name) {
        checkNotNull(name);
        return get(MagnumPod.class, uri("/pods")).param("name", name).execute();
    }

    @Override
    public Pod create(Pod pod) {
        //post(MagnumPod.class, "/pods").entity(new InputStreamPayload(new ByteArrayInputStream(podManifest.getBytes()))).execute();
        return post(MagnumPod.class, "/pods").entity(pod).execute();
    }

    @Override
    public ActionResponse delete(String id) {
        checkNotNull(id);
        return deleteWithResponse("/pods", id).execute();
    }
}
