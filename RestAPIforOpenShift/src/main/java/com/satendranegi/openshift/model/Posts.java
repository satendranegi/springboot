
package com.satendranegi.openshift.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Posts {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    @JsonProperty("postData")
    private String postData;
    @JsonProperty("postDateTime")
    private String postDateTime;
    @JsonProperty("postedById")
    private String postedById;
    @JsonProperty("tags")
    private String tags;

  

    @JsonProperty("postData")
    public String getPostData() {
        return postData;
    }

    @JsonProperty("postData")
    public void setPostData(String postData) {
        this.postData = postData;
    }

    @JsonProperty("postDateTime")
    public String getPostDateTime() {
        return postDateTime;
    }

    @JsonProperty("postDateTime")
    public void setPostDateTime(String postDateTime) {
        this.postDateTime = postDateTime;
    }

    @JsonProperty("postedById")
    public String getPostedById() {
        return postedById;
    }

    @JsonProperty("postedById")
    public void setPostedById(String postedById) {
        this.postedById = postedById;
    }

    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

}
