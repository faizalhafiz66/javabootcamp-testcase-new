package com.Javabootcamp.spring.dao.interfaces;

import java.util.List;

import com.Javabootcamp.spring.models.FilmModel;

public interface FilmDAO {
	
	List<FilmModel> getAllMovie();
	List<FilmModel> getAllMovieByYear(int Year);
}