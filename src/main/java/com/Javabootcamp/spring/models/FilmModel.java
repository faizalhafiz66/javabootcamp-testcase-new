package com.Javabootcamp.spring.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="film")
public class FilmModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="film_id")
	private int filmid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="release_year")
	private int releaseyear;
	
	@Column(name="language_id")
	private int languageid;
	
	public FilmModel() {
		
	}

	public FilmModel(String title, String description, int releaseyear, int languageid) {
		this.title = title;
		this.description = description;
		this.releaseyear = releaseyear;
		this.languageid = languageid;
	}

	public int getFilmid() {
		return filmid;
	}

	public void setFilmid(int filmid) {
		this.filmid = filmid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public int getLanguageid() {
		return languageid;
	}

	public void setLanguageid(int languageid) {
		this.languageid = languageid;
	}

	@Override
	public String toString() {
		return "FilmModel [filmid=" + filmid + ", title=" + title + ", description=" + description + ", releaseyear="
				+ releaseyear + ", languageid=" + languageid + "]";
	}
	
	
}
