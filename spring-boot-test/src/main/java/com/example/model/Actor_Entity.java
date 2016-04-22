package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table

public class Actor_Entity {
	@Id
	long CastID;
	
	enum CastType {LEAD_ACTOR, LEAD_ACTRESS,SUPP_Actor,SUPP_tress,Child};
	@Id
	String CastName;
	String CastDescription;
	@ManyToMany
	Movie_Entity movie;
	public Movie_Entity getMovie() {
		return movie;
	}
	public void setMovie(Movie_Entity movie) {
		this.movie = movie;
	}
	public long getCastID() {
		return CastID;
	}
	public void setCastID(long castID) {
		CastID = castID;
	}
	public String getCastName() {
		return CastName;
	}
	public void setCastName(String castName) {
		CastName = castName;
	}
	public String getCastDescription() {
		return CastDescription;
	}
	public void setCastDescription(String castDescription) {
		CastDescription = castDescription;
	}
	
	
}
