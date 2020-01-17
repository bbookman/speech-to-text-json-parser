
package com.bookmanb.json.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


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



}
