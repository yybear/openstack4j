package org.openstack4j.model.magnum;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.ReplicationControllerBuilder;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface ReplicationController extends ModelEntity, Buildable<ReplicationControllerBuilder> {
    String getId();

    String getName();

    List<String> getImages();

    String getBayId();

    Map<String, String> getLabels();

    Integer getReplicas();

    String getManifestUrl();

    String getManifest();

    String getCreatedAt();

    String getUpdatedAt();
}
