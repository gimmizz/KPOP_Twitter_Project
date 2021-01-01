
package guru.learningjournal.kafka.examples;

import java.lang.Long;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created_at",
        "id",
        "id_str",
        "text",
        "source",
        "retweet_count",
        "lang",
        "truncated",
        "artist"
})
public class TwitterClean {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("text")
    private String text;
    @JsonProperty("source")
    private String source;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("artist")
    private String artist;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TwitterClean.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null)?"<null>":this.idStr));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null)?"<null>":this.source));
        sb.append(',');
        sb.append("retweetCount");
        sb.append('=');
        sb.append(((this.retweetCount == null)?"<null>":this.retweetCount));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("truncated");
        sb.append('=');
        sb.append(((this.truncated == null)?"<null>":this.truncated));
        sb.append(',');
        sb.append("artist");
        sb.append('=');
        sb.append(((this.artist == null)?"<null>":this.artist));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.idStr == null)? 0 :this.idStr.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.artist == null)? 0 :this.artist.hashCode()));
        result = ((result* 31)+((this.truncated == null)? 0 :this.truncated.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.source == null)? 0 :this.source.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.retweetCount == null)? 0 :this.retweetCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TwitterClean) == false) {
            return false;
        }
        TwitterClean rhs = ((TwitterClean) other);
        return (((((((((((this.idStr == rhs.idStr)||((this.idStr!= null)&&this.idStr.equals(rhs.idStr)))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.artist == rhs.artist)||((this.artist!= null)&&this.artist.equals(rhs.artist))))&&((this.truncated == rhs.truncated)||((this.truncated!= null)&&this.truncated.equals(rhs.truncated))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.source == rhs.source)||((this.source!= null)&&this.source.equals(rhs.source))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.retweetCount == rhs.retweetCount)||((this.retweetCount!= null)&&this.retweetCount.equals(rhs.retweetCount))));
    }

}
