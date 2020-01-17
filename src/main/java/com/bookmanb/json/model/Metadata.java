
package com.bookmanb.json.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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


}
