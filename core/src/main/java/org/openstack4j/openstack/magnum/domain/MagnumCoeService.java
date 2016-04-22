package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.CoeService;
import org.openstack4j.model.magnum.builder.ServiceBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public class MagnumCoeService implements CoeService {
    @JsonProperty("uuid")
    private String id;

    private String name;

    @JsonProperty("bay_uuid")
    private String bayId;

    private List<String> labels;

    private String ip;

    private List<Map<String, String>> ports;

    private String manifestUrl;

    private String manifest;

    private String createdAt;

    private String updatedAt;

    @Override
    public ServiceBuilder toBuilder() {
        return new MagnumServiceBuilder(this);
    }

    public static class CoeServices extends ListResult<MagnumCoeService> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("services")
        protected List<MagnumCoeService> list;

        public List<MagnumCoeService> value() {
            return list;
        }
    }

    public static class MagnumServiceBuilder implements ServiceBuilder {
        private MagnumCoeService m;

        MagnumServiceBuilder() {
            this(new MagnumCoeService());
        }

        MagnumServiceBuilder(MagnumCoeService coeService) {
            this.m = coeService;
        }

        @Override
        public ServiceBuilder manifestUrl(String manifestUrl) {
            m.manifestUrl = manifestUrl;
            return this;
        }

        @Override
        public ServiceBuilder manifest(String manifest) {
            m.manifest = manifest;
            return this;
        }

        @Override
        public ServiceBuilder bayId(String bayId) {
            m.bayId = bayId;
            return this;
        }

        @Override
        public CoeService build() {
            return m;
        }

        @Override
        public ServiceBuilder from(CoeService in) {
            m = (MagnumCoeService) in;
            return this;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBayId() {
        return bayId;
    }

    public List<String> getLabels() {
        return labels;
    }

    public String getIp() {
        return ip;
    }

    public List<Map<String, String>> getPorts() {
        return ports;
    }

    public String getManifestUrl() {
        return manifestUrl;
    }

    public String getManifest() {
        return manifest;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
