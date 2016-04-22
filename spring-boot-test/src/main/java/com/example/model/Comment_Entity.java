package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table

public class Comment_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
long Comment_id;
	@Column(length=400)
String Comment;
	@ManyToMany
Movie_Entity movi;
public Movie_Entity getMovi() {
		return movi;
	}
	public void setMovi(Movie_Entity movi) {
		this.movi = movi;
	}
	@ManyToMany
User user;
public long getComment_id() {
	return Comment_id;
}
public void setComment_id(long comment_id) {
	Comment_id = comment_id;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Comment_Entity(long comment_id, String comment, User user) {
	super();
	Comment_id = comment_id;
	Comment = comment;
	this.user = user;
}
	
	
	
}
