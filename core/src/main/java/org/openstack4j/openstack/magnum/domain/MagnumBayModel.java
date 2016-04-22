package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.BayModel;
import org.openstack4j.model.magnum.builder.BayModelBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public class MagnumBayModel implements BayModel {
    @JsonProperty("uuid")
    private String id;

    private String name;

    private String flavorId;

    private String masterFlavorId;

    private String noProxy;

    private String httpsProxy;

    private boolean tlsDisabled;

    private String keypairId;

    @JsonProperty("public")
    private boolean isPublic;

    private Integer dockerVolumeSize;

    private String serverType;

    private String externalNetworkId;

    private String clusterDistro;

    private String imageId;

    private String volumeDriver;

    private boolean registryEnabled;

    private String apiserverPort;

    private String networkDriver;

    private String dnsNameserver;
    
    private String coe;

    private String fixedNetwork;

    private Map<String, String> labels;

    private String createdAt;

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
    public Map<String, String> getLabels() {
        return labels;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }

    public static class BayModels extends ListResult<MagnumBayModel> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("baymodels")
        protected List<MagnumBayModel> list;

        public List<MagnumBayModel> value() {
            return list;
        }
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
        public BayModelBuilder externalNetworkId(String externalNetworkId) {
            m.externalNetworkId = externalNetworkId;
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
        public BayModelBuilder labels(Map<String, String> labels) {
            m.labels = labels;
            return this;
        }

        @Override
        public BayModelBuilder httpProxy(String httpProxy) {
            m.httpsProxy = httpProxy;
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
