
package com.bookmanb.json.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Result {

    @SerializedName("alternatives")
    @Expose
    private List<Alternative> alternatives = null;
    @SerializedName("languageCode")
    @Expose
    private String languageCode;

    public List<Alternative> getAlternatives() {
        return alternatives;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alternatives", alternatives).append("languageCode", languageCode).toString();
    }

}
