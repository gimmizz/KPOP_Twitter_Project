
package guru.learningjournal.kafka.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hashtags",
    "media",
    "urls",
    "user_mentions"
})
public class Entities {

    @JsonProperty("hashtags")
    private List<Object> hashtags = new ArrayList<Object>();
    @JsonProperty("media")
    private List<Object> media = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Object> urls = new ArrayList<Object>();
    @JsonProperty("user_mentions")
    private List<Object> userMentions = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("hashtags")
    public List<Object> getHashtags() {
        return hashtags;
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("media")
    public List<Object> getMedia() {
        return media;
    }

    @JsonProperty("media")
    public void setMedia(List<Object> media) {
        this.media = media;
    }

    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
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
        sb.append(Entities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hashtags");
        sb.append('=');
        sb.append(((this.hashtags == null)?"<null>":this.hashtags));
        sb.append(',');
        sb.append("media");
        sb.append('=');
        sb.append(((this.media == null)?"<null>":this.media));
        sb.append(',');
        sb.append("urls");
        sb.append('=');
        sb.append(((this.urls == null)?"<null>":this.urls));
        sb.append(',');
        sb.append("userMentions");
        sb.append('=');
        sb.append(((this.userMentions == null)?"<null>":this.userMentions));
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
        result = ((result* 31)+((this.urls == null)? 0 :this.urls.hashCode()));
        result = ((result* 31)+((this.media == null)? 0 :this.media.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.hashtags == null)? 0 :this.hashtags.hashCode()));
        result = ((result* 31)+((this.userMentions == null)? 0 :this.userMentions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        Entities rhs = ((Entities) other);
        return ((((((this.urls == rhs.urls)||((this.urls!= null)&&this.urls.equals(rhs.urls)))&&((this.media == rhs.media)||((this.media!= null)&&this.media.equals(rhs.media))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.hashtags == rhs.hashtags)||((this.hashtags!= null)&&this.hashtags.equals(rhs.hashtags))))&&((this.userMentions == rhs.userMentions)||((this.userMentions!= null)&&this.userMentions.equals(rhs.userMentions))));
    }

}
