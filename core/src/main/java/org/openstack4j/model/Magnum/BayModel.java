package org.openstack4j.model.magnum;

import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.BayModelBuilder;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayModel extends ModelEntity, Buildable<BayModelBuilder> {
    String getId();

    String getName();

    String getFlavorId();

    String getMasterFlavorId();

    String getNoProxy();

    String getHttpsProxy();

    boolean isTlsDisabled();

    String getKeypairId();

    boolean isPublic();

    Integer getDockerVolumeSize();

    String getServerType();

    String getExternalNetworkId();

    String getClusterDistro();

    String getImageId();

    String getVolumeDriver();

    boolean isRegistryEnabled();

    String getApiserverPort();

    String getNetworkDriver();

    String getDnsNameserver();

    String getCoe();

    String getFixedNetwork();

    String getCreatedAt();

    String getUpdatedAt();
}
