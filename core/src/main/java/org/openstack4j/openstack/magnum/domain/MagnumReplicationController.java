package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.ReplicationController;
import org.openstack4j.model.magnum.builder.ReplicationControllerBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public class MagnumReplicationController implements ReplicationController {
    @JsonProperty("uuid")
    private String id;

    private String name;

    private List<String> images;

    @JsonProperty("bay_uuid")
    private String bayId;

    private Map<String, String> labels;

    private Integer replicas;

    private String manifestUrl;

    private String manifest;

    private String createdAt;

    private String updatedAt;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getImages() {
        return images;
    }

    public String getBayId() {
        return bayId;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public Integer getReplicas() {
        return replicas;
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

    public static class ReplicationControllers extends ListResult<MagnumReplicationController> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("rcs")
        protected List<MagnumReplicationController> list;

        public List<MagnumReplicationController> value() {
            return list;
        }
    }

    @Override
    public ReplicationControllerBuilder toBuilder() {
        return new MagnumReplicationControllerBuilder(this);
    }

    public static class MagnumReplicationControllerBuilder implements ReplicationControllerBuilder {
        private MagnumReplicationController m;

        MagnumReplicationControllerBuilder(MagnumReplicationController m) {
            this.m = m;
        }

        MagnumReplicationControllerBuilder() {
            this(new MagnumReplicationController());
        }

        @Override
        public ReplicationControllerBuilder manifestUrl(String manifestUrl) {
            m.manifestUrl = manifestUrl;
            return this;
        }

        @Override
        public ReplicationControllerBuilder manifest(String manifest) {
            m.manifest = manifest;
            return this;
        }

        @Override
        public ReplicationControllerBuilder bayId(String bayId) {
            m.bayId = bayId;
            return this;
        }

        @Override
        public ReplicationController build() {
            return m;
        }

        @Override
        public ReplicationControllerBuilder from(ReplicationController in) {
            m = (MagnumReplicationController) in;
            return this;
        }
    }
}
