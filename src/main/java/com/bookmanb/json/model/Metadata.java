
package com.bookmanb.json.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Metadata {

    @SerializedName("@type")
    @Expose
    private String type;
    @SerializedName("progressPercent")
    @Expose
    private Integer progressPercent;
    @SerializedName("startTime")
    @Expose
    private String startTime;
    @SerializedName("lastUpdateTime")
    @Expose
    private String lastUpdateTime;

    public String getType() {
        return type;
    }

    public Integer getProgressPercent() {
        return progressPercent;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("progressPercent", progressPercent).append("startTime", startTime).append("lastUpdateTime", lastUpdateTime).toString();
    }

}
