package org.openstack4j.model.magnum;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.PodBuilder;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface Pod extends ModelEntity, Buildable<PodBuilder> {
    String getId();

    String getName();

    String getDesc();

    String getBayId();

    List<String> getImages();

    Map<String, String> getLabels();

    String getStatus();

    String getHost();

    String getManifestUrl();

    String getManifest();

    String getCreatedAt();

    String getUpdatedAt();
}
