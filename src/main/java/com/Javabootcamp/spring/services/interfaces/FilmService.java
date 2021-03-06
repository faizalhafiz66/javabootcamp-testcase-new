package com.Javabootcamp.spring.services.interfaces;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Javabootcamp.spring.models.FilmModel;

@Service
public interface FilmService {
	
	List<FilmModel> getAllMovie();
	List<FilmModel> getMoviebyYear(int year);
	void InsertFilm(FilmModel film);
	void DeleteFilm(int filmid);
	void UpdateFilm(FilmModel film);
	FilmModel getFilm(int filmId);
}
