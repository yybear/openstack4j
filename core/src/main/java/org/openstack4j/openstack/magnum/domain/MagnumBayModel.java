package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.openstack4j.model.magnum.BayModel;
import org.openstack4j.model.magnum.builder.BayModelBuilder;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
@JsonRootName("baymodel")
public class MagnumBayModel implements BayModel {
    @JsonProperty("uuid")
    private String id;

    private String name;

    @JsonProperty("flavor_id")
    private String flavorId;

    @JsonProperty("master_flavor_id")
    private String masterFlavorId;

    @JsonProperty("no_proxy")
    private String noProxy;

    @JsonProperty("https_proxy")
    private String httpsProxy;

    @JsonProperty("tls_disabled")
    private boolean tlsDisabled;

    @JsonProperty("keypair_id")
    private String keypairId;

    @JsonProperty("public")
    private boolean isPublic;

    @JsonProperty("docker_volume_size")
    private Integer dockerVolumeSize;

    @JsonProperty("server_type")
    private String serverType;

    @JsonProperty("external_network_id")
    private String externalNetworkId;

    @JsonProperty("cluster_distro")
    private String clusterDistro;

    @JsonProperty("image_id")
    private String imageId;

    @JsonProperty("volume_driver")
    private String volumeDriver;

    @JsonProperty("registry_enabled")
    private boolean registryEnabled;

    @JsonProperty("apiserver_port")
    private String apiserverPort;

    @JsonProperty("network_driver")
    private String networkDriver;

    /*@JsonProperty("dns_nameserver")*/
    private String dnsNameserver;
    
    private String coe;

    @JsonProperty("fixed_network")
    private String fixedNetwork;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;


    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFlavorId() {
        return flavorId;
    }

    @Override
    public String getMasterFlavorId() {
        return masterFlavorId;
    }

    @Override
    public String getNoProxy() {
        return noProxy;
    }

    @Override
    public String getHttpsProxy() {
        return httpsProxy;
    }

    @Override
    public boolean isTlsDisabled() {
        return tlsDisabled;
    }

    @Override
    public String getKeypairId() {
        return keypairId;
    }

    @Override
    public boolean isPublic() {
        return isPublic;
    }

    @Override
    public Integer getDockerVolumeSize() {
        return dockerVolumeSize;
    }

    @Override
    public String getServerType() {
        return serverType;
    }

    @Override
    public String getExternalNetworkId() {
        return externalNetworkId;
    }

    @Override
    public String getClusterDistro() {
        return clusterDistro;
    }

    @Override
    public String getImageId() {
        return imageId;
    }

    @Override
    public String getVolumeDriver() {
        return volumeDriver;
    }

    @Override
    public boolean isRegistryEnabled() {
        return registryEnabled;
    }

    @Override
    public String getApiserverPort() {
        return apiserverPort;
    }

    @Override
    public String getNetworkDriver() {
        return networkDriver;
    }

    @Override
    public String getDnsNameserver() {
        return dnsNameserver;
    }

    @Override
    public String getCoe() {
        return coe;
    }

    @Override
    public String getFixedNetwork() {
        return fixedNetwork;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public BayModelBuilder toBuilder() {
        return new BayModelConcreteBuilder(this);
    }


    public static class BayModelConcreteBuilder implements BayModelBuilder {
        private MagnumBayModel m;

        BayModelConcreteBuilder() {
            this(new MagnumBayModel());
        }
        
        BayModelConcreteBuilder(MagnumBayModel m) {
            this.m = m;
        }
        
        @Override
        public BayModelBuilder id(String id) {
            m.id = id;
            return this;
        }

        @Override
        public BayModelBuilder name(String name) {
            m.name = name;
            return this;
        }

        @Override
        public BayModelBuilder flavorId(String flavorId) {
            m.flavorId = flavorId;
            return this;
        }

        @Override
        public BayModelBuilder masterFlavorId(String masterFlavorId) {
            m.masterFlavorId = masterFlavorId;
            return this;
        }

        @Override
        public BayModelBuilder noProxy(String noProxy) {
            m.noProxy = noProxy;
            return this;
        }

        @Override
        public BayModelBuilder httpsProxy(String httpsProxy) {
            m.httpsProxy = httpsProxy;
            return this;
        }

        @Override
        public BayModelBuilder tlsDisabled(boolean tlsDisabled) {
            m.tlsDisabled = tlsDisabled;
            return this;
        }

        @Override
        public BayModelBuilder keypairId(String keypairId) {
            m.keypairId = keypairId;
            return this;
        }

        @Override
        public BayModelBuilder isPublic(boolean isPublic) {
            m.isPublic = isPublic;
            return this;
        }

        @Override
        public BayModelBuilder dockerVolumeSize(Integer dockerVolumeSize) {
            m.dockerVolumeSize = dockerVolumeSize;
            return this;
        }

        @Override
        public BayModelBuilder serverType(String serverType) {
            m.serverType = serverType;
            return this;
        }

        @Override
        public BayModelBuilder externalNetworkId(String externalNetworkId) {
            m.externalNetworkId = externalNetworkId;
            return this;
        }

        @Override
        public BayModelBuilder clusterDistro(String clusterDistro) {
            m.clusterDistro = clusterDistro;
            return this;
        }

        @Override
        public BayModelBuilder imageId(String imageId) {
            m.imageId = imageId;
            return this;
        }

        @Override
        public BayModelBuilder registryEnabled(boolean registryEnabled) {
            m.registryEnabled = registryEnabled;
            return this;
        }

        @Override
        public BayModelBuilder apiserverPort(String apiserverPort) {
            m.apiserverPort = apiserverPort;
            return this;
        }

        @Override
        public BayModelBuilder networkDriver(String networkDriver) {
            m.networkDriver = networkDriver;
            return this;
        }

        @Override
        public BayModelBuilder dnsNameserver(String dnsNameserver) {
            m.dnsNameserver = dnsNameserver;
            return this;
        }

        @Override
        public BayModelBuilder coe(String coe) {
            m.coe = coe;
            return this;
        }

        @Override
        public BayModelBuilder fixedNetwork(String fixedNetwork) {
            m.fixedNetwork = fixedNetwork;
            return this;
        }

        @Override
        public BayModelBuilder volumeDriver(String volumeDriver) {
            m.volumeDriver = volumeDriver;
            return this;
        }

        @Override
        public BayModelBuilder createdAt(String createdAt) {
            m.createdAt = createdAt;
            return this;
        }

        @Override
        public BayModelBuilder updatedAt(String updatedAt) {
            m.updatedAt = updatedAt;
            return this;
        }

        @Override
        public BayModel build() {
            return m;
        }

        @Override
        public BayModelBuilder from(BayModel in) {
            m = (MagnumBayModel) in;
            return this;
        }
    }
}
