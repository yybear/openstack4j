package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.Pod;
import org.openstack4j.model.magnum.builder.PodBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/21.
 */
public class MagnumPod implements Pod {
    @JsonProperty("uuid")
    private String id;

    private String name;

    private String desc;

    @JsonProperty("bay_uuid")
    private String bayId;

    private List<String> images;

    private Map<String, String> labels;

    private String status;

    private String host;

    private String manifest;

    private String manifestUrl;

    private String createdAt;

    private String updatedAt;

    @Override
    public PodBuilder toBuilder() {
        return new MagnumPodBuilder(this);
    }

    public static class Pods extends ListResult<MagnumPod> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("pods")
        protected List<MagnumPod> list;

        public List<MagnumPod> value() {
            return list;
        }
    }

    public static class MagnumPodBuilder implements PodBuilder {
        private MagnumPod m;

        MagnumPodBuilder(MagnumPod pod) {
            this.m = pod;
        }

        MagnumPodBuilder() {
            this(new MagnumPod());
        }

        @Override
        public PodBuilder manifestUrl(String manifestUrl) {
            m.manifestUrl = manifestUrl;
            return this;
        }

        @Override
        public PodBuilder manifest(String manifest) {
            m.manifest = manifest;
            return this;
        }

        @Override
        public PodBuilder bayId(String bayId) {
            m.bayId = bayId;
            return this;
        }

        @Override
        public Pod build() {
            return m;
        }

        @Override
        public PodBuilder from(Pod in) {
            m = (MagnumPod) in;
            return this;
        }
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getBayId() {
        return bayId;
    }

    @Override
    public List<String> getImages() {
        return images;
    }

    @Override
    public Map<String, String> getLabels() {
        return labels;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getHost() {
        return host;
    }

    @Override
    public String getManifestUrl() {
        return manifestUrl;
    }

    @Override
    public String getManifest() {
        return manifest;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }
}
