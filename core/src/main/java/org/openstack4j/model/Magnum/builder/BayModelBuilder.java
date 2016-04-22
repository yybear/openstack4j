package org.openstack4j.model.magnum.builder;

import org.openstack4j.common.Buildable.Builder;
import org.openstack4j.model.magnum.BayModel;

import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface BayModelBuilder extends Builder<BayModelBuilder, BayModel> {

    BayModelBuilder name(String name);

    BayModelBuilder imageId(String imageId);

    BayModelBuilder keypairId(String keypairId);

    BayModelBuilder externalNetworkId(String externalNetworkId);

    BayModelBuilder coe(String coe);

    BayModelBuilder fixedNetwork(String fixedNetwork);

    BayModelBuilder networkDriver(String networkDriver);

    BayModelBuilder volumeDriver(String volumeDriver);

    BayModelBuilder dnsNameserver(String dnsNameserver);

    BayModelBuilder flavorId(String flavorId);

    BayModelBuilder masterFlavorId(String masterFlavorId);

    BayModelBuilder dockerVolumeSize(Integer dockerVolumeSize);

    BayModelBuilder httpProxy(String httpProxy);

    BayModelBuilder httpsProxy(String httpsProxy);

    BayModelBuilder noProxy(String noProxy);

    BayModelBuilder labels(Map<String, String> labels);

    BayModelBuilder tlsDisabled(boolean tlsDisabled);

    BayModelBuilder isPublic(boolean isPublic);

    BayModelBuilder registryEnabled(boolean registryEnabled);
}
