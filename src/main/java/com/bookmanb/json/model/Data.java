
package com.bookmanb.json.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Data {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("done")
    @Expose
    private Boolean done;
    @SerializedName("response")
    @Expose
    private Response response;

    public String getName() {
        return name;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public Boolean getDone() {
        return done;
    }

    public Response getResponse() {
        return response;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("metadata", metadata).append("done", done).append("response", response).toString();
    }

}
