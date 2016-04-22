package org.openstack4j.model.magnum;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.ContainerBuilder;

import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public interface Container extends ModelEntity, Buildable<ContainerBuilder> {
    String getId();

    String getName();

    String getBayId();

    String getImage();

    String getMemory();

    String getStatus();

    String getCommand();

    Map<String, String> getEnvironment();

    String getCreatedAt();

    String getUpdatedAt();
}
