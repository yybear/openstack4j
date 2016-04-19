package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.magnum.BayModel;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayModelBuilder extends Builder<BayModelBuilder, BayModel> {

    BayModelBuilder id(String id);

    BayModelBuilder name(String name);

    BayModelBuilder flavorId(String flavorId);

    BayModelBuilder masterFlavorId(String masterFlavorId);

    BayModelBuilder noProxy(String noProxy);

    BayModelBuilder httpsProxy(String httpsProxy);

    BayModelBuilder tlsDisabled(boolean tlsDisabled);

    BayModelBuilder keypairId(String keypairId);

    BayModelBuilder isPublic(boolean isPublic);

    BayModelBuilder dockerVolumeSize(Integer dockerVolumeSize);

    BayModelBuilder serverType(String serverType);

    BayModelBuilder externalNetworkId(String externalNetworkId);

    BayModelBuilder clusterDistro(String clusterDistro);

    BayModelBuilder imageId(String imageId);

    BayModelBuilder registryEnabled(boolean registryEnabled);

    BayModelBuilder apiserverPort(String apiserverPort);

    BayModelBuilder networkDriver(String networkDriver);

    BayModelBuilder dnsNameserver(String dnsNameserver);

    BayModelBuilder coe(String coe);

    BayModelBuilder fixedNetwork(String fixedNetwork);

    BayModelBuilder volumeDriver(String volumeDriver);

    BayModelBuilder createdAt(String createdAt);

    BayModelBuilder updatedAt(String updatedAt);
}
