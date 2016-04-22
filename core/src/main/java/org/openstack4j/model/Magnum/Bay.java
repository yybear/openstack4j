package org.openstack4j.model.magnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openstack4j.common.Buildable;
import org.openstack4j.model.ModelEntity;
import org.openstack4j.model.magnum.builder.BayBuilder;

import java.util.List;

/**
 * Created by ganqing(0027006935@zte.com.cn) on 2016/4/19.
 */
public interface Bay extends ModelEntity, Buildable<BayBuilder> {
    public enum Status {
        CREATE_IN_PROGRESS, CREATE_FAILED, CREATE_COMPLETE,
        UPDATE_IN_PROGRESS, UPDATE_FAILED, UPDATE_COMPLETE,
        DELETE_IN_PROGRESS, DELETE_FAILED, DELETE_COMPLETE,
        RESUME_COMPLETE, RESTORE_COMPLETE, ROLLBACK_COMPLETE,
        SNAPSHOT_COMPLETE, CHECK_COMPLETE, ADOPT_COMPLETE;

        @JsonCreator
        public static Status value(String v)
        {
            if (v == null) return CREATE_COMPLETE;
            try {
                return valueOf(v.toUpperCase());
            } catch (IllegalArgumentException e) {
                return CREATE_COMPLETE;
            }
        }

        @JsonValue
        public String value() {
            return name().toLowerCase();
        }
    }

    String getId();

    String getName();

    String getBaymodelId();

    Integer getNodeCount();

    Integer getMasterCount();

    Integer getBayCreateTimeout();

    String getStackId();

    Status getStatus();

    String getStatusReason();

    String getDiscoveryUrl();

    String getApiAddress();

    List<String> getNodeAddress();

    List<String> getMasterAddress();

    String getCreatedAt();

    String getUpdatedAt();
}
