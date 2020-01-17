
package com.bookmanb.json.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Alternative {

    @SerializedName("transcript")
    @Expose
    private String transcript;
    @SerializedName("confidence")
    @Expose
    private Double confidence;

    public String getTranscript() {
        return transcript;
    }

    public Double getConfidence() {
        return confidence;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transcript", transcript).append("confidence", confidence).toString();
    }

}
