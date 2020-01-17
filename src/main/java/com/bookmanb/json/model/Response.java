
package com.bookmanb.json.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

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

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("results", results).toString();
    }

}
