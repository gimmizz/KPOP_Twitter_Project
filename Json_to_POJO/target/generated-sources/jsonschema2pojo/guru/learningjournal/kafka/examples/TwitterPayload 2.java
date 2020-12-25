
package guru.learningjournal.kafka.examples;

import java.base.Long;
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
    "text",
    "retweet_count",
    "lang",
    "retweeted_status",
    "quoted_status",
    "quoted_count",
    "reply_count",
    "favorite_count",
    "favorited",
    "retweeted",
    "retweet",
    "entites"
})
public class TwitterPayload {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("retweeted_status")
    private Twitter retweetedStatus;
    @JsonProperty("quoted_status")
    private Twitter quotedStatus;
    @JsonProperty("quoted_count")
    private Integer quotedCount;
    @JsonProperty("reply_count")
    private Integer replyCount;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweet")
    private Boolean retweet;
    @JsonProperty("entites")
    private Entities entites;
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

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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

    @JsonProperty("retweeted_status")
    public Twitter getRetweetedStatus() {
        return retweetedStatus;
    }

    @JsonProperty("retweeted_status")
    public void setRetweetedStatus(Twitter retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    @JsonProperty("quoted_status")
    public Twitter getQuotedStatus() {
        return quotedStatus;
    }

    @JsonProperty("quoted_status")
    public void setQuotedStatus(Twitter quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    @JsonProperty("quoted_count")
    public Integer getQuotedCount() {
        return quotedCount;
    }

    @JsonProperty("quoted_count")
    public void setQuotedCount(Integer quotedCount) {
        this.quotedCount = quotedCount;
    }

    @JsonProperty("reply_count")
    public Integer getReplyCount() {
        return replyCount;
    }

    @JsonProperty("reply_count")
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("retweet")
    public Boolean getRetweet() {
        return retweet;
    }

    @JsonProperty("retweet")
    public void setRetweet(Boolean retweet) {
        this.retweet = retweet;
    }

    @JsonProperty("entites")
    public Entities getEntites() {
        return entites;
    }

    @JsonProperty("entites")
    public void setEntites(Entities entites) {
        this.entites = entites;
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
        sb.append(TwitterPayload.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("retweetCount");
        sb.append('=');
        sb.append(((this.retweetCount == null)?"<null>":this.retweetCount));
        sb.append(',');
        sb.append("lang");
        sb.append('=');
        sb.append(((this.lang == null)?"<null>":this.lang));
        sb.append(',');
        sb.append("retweetedStatus");
        sb.append('=');
        sb.append(((this.retweetedStatus == null)?"<null>":this.retweetedStatus));
        sb.append(',');
        sb.append("quotedStatus");
        sb.append('=');
        sb.append(((this.quotedStatus == null)?"<null>":this.quotedStatus));
        sb.append(',');
        sb.append("quotedCount");
        sb.append('=');
        sb.append(((this.quotedCount == null)?"<null>":this.quotedCount));
        sb.append(',');
        sb.append("replyCount");
        sb.append('=');
        sb.append(((this.replyCount == null)?"<null>":this.replyCount));
        sb.append(',');
        sb.append("favoriteCount");
        sb.append('=');
        sb.append(((this.favoriteCount == null)?"<null>":this.favoriteCount));
        sb.append(',');
        sb.append("favorited");
        sb.append('=');
        sb.append(((this.favorited == null)?"<null>":this.favorited));
        sb.append(',');
        sb.append("retweeted");
        sb.append('=');
        sb.append(((this.retweeted == null)?"<null>":this.retweeted));
        sb.append(',');
        sb.append("retweet");
        sb.append('=');
        sb.append(((this.retweet == null)?"<null>":this.retweet));
        sb.append(',');
        sb.append("entites");
        sb.append('=');
        sb.append(((this.entites == null)?"<null>":this.entites));
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
        result = ((result* 31)+((this.retweet == null)? 0 :this.retweet.hashCode()));
        result = ((result* 31)+((this.retweeted == null)? 0 :this.retweeted.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.quotedCount == null)? 0 :this.quotedCount.hashCode()));
        result = ((result* 31)+((this.replyCount == null)? 0 :this.replyCount.hashCode()));
        result = ((result* 31)+((this.retweetedStatus == null)? 0 :this.retweetedStatus.hashCode()));
        result = ((result* 31)+((this.quotedStatus == null)? 0 :this.quotedStatus.hashCode()));
        result = ((result* 31)+((this.entites == null)? 0 :this.entites.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.lang == null)? 0 :this.lang.hashCode()));
        result = ((result* 31)+((this.retweetCount == null)? 0 :this.retweetCount.hashCode()));
        result = ((result* 31)+((this.favoriteCount == null)? 0 :this.favoriteCount.hashCode()));
        result = ((result* 31)+((this.favorited == null)? 0 :this.favorited.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TwitterPayload) == false) {
            return false;
        }
        TwitterPayload rhs = ((TwitterPayload) other);
        return ((((((((((((((((this.retweet == rhs.retweet)||((this.retweet!= null)&&this.retweet.equals(rhs.retweet)))&&((this.retweeted == rhs.retweeted)||((this.retweeted!= null)&&this.retweeted.equals(rhs.retweeted))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.quotedCount == rhs.quotedCount)||((this.quotedCount!= null)&&this.quotedCount.equals(rhs.quotedCount))))&&((this.replyCount == rhs.replyCount)||((this.replyCount!= null)&&this.replyCount.equals(rhs.replyCount))))&&((this.retweetedStatus == rhs.retweetedStatus)||((this.retweetedStatus!= null)&&this.retweetedStatus.equals(rhs.retweetedStatus))))&&((this.quotedStatus == rhs.quotedStatus)||((this.quotedStatus!= null)&&this.quotedStatus.equals(rhs.quotedStatus))))&&((this.entites == rhs.entites)||((this.entites!= null)&&this.entites.equals(rhs.entites))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lang == rhs.lang)||((this.lang!= null)&&this.lang.equals(rhs.lang))))&&((this.retweetCount == rhs.retweetCount)||((this.retweetCount!= null)&&this.retweetCount.equals(rhs.retweetCount))))&&((this.favoriteCount == rhs.favoriteCount)||((this.favoriteCount!= null)&&this.favoriteCount.equals(rhs.favoriteCount))))&&((this.favorited == rhs.favorited)||((this.favorited!= null)&&this.favorited.equals(rhs.favorited))));
    }

}
