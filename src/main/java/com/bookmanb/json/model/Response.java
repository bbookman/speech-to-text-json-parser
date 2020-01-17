
package com.bookmanb.json.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Response {

    @SerializedName("@type")
    @Expose
    private String type;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;

    public String getType() {
        return type;
    }

    public List<Result> getResults() {
        return results;
    }

}
