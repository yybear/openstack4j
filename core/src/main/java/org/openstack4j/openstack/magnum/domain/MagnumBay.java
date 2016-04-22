package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.Bay;
import org.openstack4j.model.magnum.builder.BayBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/20.
 */
public class MagnumBay implements Bay {
    @JsonProperty("uuid")
    private String id;

    private String name;

    private String baymodelId;

    private Integer nodeCount;

    private Integer masterCount;

    private Integer bayCreateTimeout;

    private String stackId;

    private Status status;

    private String statusReason;

    private String discoveryUrl;

    private String apiAddress;

    private List<String> nodeAddress;

    private List<String> masterAddress;

    private String createdAt;

    private String updatedAt;

    @Override
    public BayBuilder toBuilder() {
        return new MagnumBayBuilder(this);
    }

    public static class Bays extends ListResult<MagnumBay> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("bays")
        protected List<MagnumBay> list;

        public List<MagnumBay> value() {
            return list;
        }
    }

    public static class MagnumBayBuilder implements BayBuilder {

        private MagnumBay m;

        MagnumBayBuilder() {
            this(new MagnumBay());
        }

        MagnumBayBuilder(MagnumBay m) {
            this.m = m;
        }

        public BayBuilder name(String name) {
            m.name = name;
            return this;
        }

        public BayBuilder baymodelId(String baymodelId) {
            m.baymodelId = baymodelId;
            return this;
        }

        public BayBuilder nodeCount(Integer nodeCount) {
            m.nodeCount = nodeCount;
            return this;
        }

        public BayBuilder masterCount(Integer masterCount) {
            m.masterCount = masterCount;
            return this;
        }

        public BayBuilder bayCreateTimeout(Integer bayCreateTimeout) {
            m.bayCreateTimeout = bayCreateTimeout;
            return this;
        }

        public BayBuilder discoveryUrl(String discoveryUrl) {
            m.discoveryUrl = discoveryUrl;
            return this;
        }

        @Override
        public Bay build() {
            return m;
        }

        @Override
        public BayBuilder from(Bay in) {
            m = (MagnumBay) in;
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
    public String getBaymodelId() {
        return baymodelId;
    }

    @Override
    public Integer getNodeCount() {
        return nodeCount;
    }

    @Override
    public Integer getMasterCount() {
        return masterCount;
    }

    @Override
    public Integer getBayCreateTimeout() {
        return bayCreateTimeout;
    }

    @Override
    public String getStackId() {
        return stackId;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public String getStatusReason() {
        return statusReason;
    }

    @Override
    public String getDiscoveryUrl() {
        return discoveryUrl;
    }

    @Override
    public String getApiAddress() {
        return apiAddress;
    }

    @Override
    public List<String> getNodeAddress() {
        return nodeAddress;
    }

    @Override
    public List<String> getMasterAddress() {
        return masterAddress;
    }

    @Override
    public String getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String getCreatedAt() {
        return createdAt;
    }
}
