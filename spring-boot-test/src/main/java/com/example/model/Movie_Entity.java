package com.example.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

//Huge database not needed only those things are needed where login is req to inject
@Entity
public class Movie_Entity {
	@OneToMany
	private long Imdb_id;
	private long Comment_id;
	@OneToMany
	private User user;
	private Date TimeStamp;
	@Column
	@Size(min=10, max=700)
	private String commentBody;
	private int likes, dislikes,hits;
	public long getImdb_id() {
		return Imdb_id;
	}
	public void setImdb_id(long imdb_id) {
		Imdb_id = imdb_id;
	}
	public long getComment_id() {
		return Comment_id;
	}
	public void setComment_id(long comment_id) {
		Comment_id = comment_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getCommentBody() {
		return commentBody;
	}
	public void setCommentBody(String commentBody) {
		this.commentBody = commentBody;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	
	
	
	
}
