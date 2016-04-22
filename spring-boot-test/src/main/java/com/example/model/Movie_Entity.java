package com.example.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

//Huge database 
@Entity

public class Movie_Entity {
	private long movieId;
	private String title;
	private int year;
	enum rated {one_star , two_star ,three_star,four_star,five_star};	
	private String released;
	private String runtime;
	private String genre;
	private String director;
	private String writers;
	
	
	@ManyToMany
	private List actors;
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public List getActors() {
		return actors;
	}
	public void setActors(List actors) {
		this.actors = actors;
	}
	@Column(length=500)
	private String plot;
	private String language;
	private String country;
	private String awards;
	private String poster;
	private int metascore;//It means reviews 
	private float imdb_rating;
	private int imdb_votes;
	private String imdb_id;
	private String type;
	
	//IMDB rating will different entity 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriters() {
		return writers;
	}
	public void setWriters(String writers) {
		this.writers = writers;
	}
	
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAwards() {
		return awards;
	}
	public void setAwards(String awards) {
		this.awards = awards;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public int getMetascore() {
		return metascore;
	}
	public void setMetascore(int metascore) {
		this.metascore = metascore;
	}
	public float getImdb_rating() {
		return imdb_rating;
	}
	public void setImdb_rating(float imdb_rating) {
		this.imdb_rating = imdb_rating;
	}
	public int getImdb_votes() {
		return imdb_votes;
	}
	public void setImdb_votes(int imdb_votes) {
		this.imdb_votes = imdb_votes;
	}
	public String getImdb_id() {
		return imdb_id;
	}
	public void setImdb_id(String imdb_id) {
		this.imdb_id = imdb_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
