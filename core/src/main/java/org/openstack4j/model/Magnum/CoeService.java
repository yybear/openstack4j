package org.openstack4j.model.magnum;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.ServiceBuilder;

import java.util.List;
import java.util.Map;

/**
 *  \{\n.*\n.*\}
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface CoeService extends ModelEntity, Buildable<ServiceBuilder> {
    String getId();

    String getName();

    String getBayId();

    List<String> getLabels();

    String getIp();

    List<Map<String, String>> getPorts();

    String getManifestUrl();

    String getManifest();

    String getCreatedAt();

    String getUpdatedAt();
}
