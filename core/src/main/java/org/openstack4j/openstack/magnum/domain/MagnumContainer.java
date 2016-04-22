package org.openstack4j.openstack.magnum.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.openstack4j.model.magnum.Container;
import org.openstack4j.model.magnum.builder.ContainerBuilder;
import org.openstack4j.openstack.common.ListResult;

import java.util.List;
import java.util.Map;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/22.
 */
public class MagnumContainer implements Container {
    @JsonProperty("uuid")
    private String id;

    private String name;

    @JsonProperty("bay_uuid")
    private String bayId;

    private String image;

    private String memory;

    private String status;

    private String command;

    private Map<String, String> environment;

    private String createdAt;

    private String updatedAt;

    @Override
    public ContainerBuilder toBuilder() {
        return null;
    }

    public static class Containers extends ListResult<MagnumContainer> {

        private static final long serialVersionUID = 1L;
        @JsonProperty("containers")
        protected List<MagnumContainer> list;

        public List<MagnumContainer> value() {
            return list;
        }
    }

    public static class MagnumContainerBuilder implements ContainerBuilder {
        private MagnumContainer m;

        MagnumContainerBuilder() {
            this(new MagnumContainer());
        }

        MagnumContainerBuilder(MagnumContainer m) {
            this.m = m;
        }

        @Override
        public Container build() {
            return m;
        }

        @Override
        public ContainerBuilder from(Container in) {
            m = (MagnumContainer) in;
            return this;
        }

        @Override
        public ContainerBuilder name(String name) {
            m.name = name;
            return this;
        }

        @Override
        public ContainerBuilder image(String image) {
            m.image = image;
            return this;
        }

        @Override
        public ContainerBuilder command(String command) {
            m.command = command;
            return this;
        }

        @Override
        public ContainerBuilder bayId(String bayId) {
            m.bayId = bayId;
            return this;
        }

        @Override
        public ContainerBuilder memory(String memory) {
            m.memory = memory;
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

    public String getImage() {
        return image;
    }

    public String getMemory() {
        return memory;
    }

    public String getStatus() {
        return status;
    }

    public String getCommand() {
        return command;
    }

    public Map<String, String> getEnvironment() {
        return environment;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
