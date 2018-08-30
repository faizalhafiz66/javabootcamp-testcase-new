package com.Javabootcamp.spring.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Javabootcamp.spring.dao.interfaces.FilmDAO;
import com.Javabootcamp.spring.models.FilmModel;
import com.Javabootcamp.spring.services.interfaces.FilmService;


@Service("FilmService")
@Transactional
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO filmDAO;
	
	@Override
	
	public List<FilmModel> getAllMovie() {

		return filmDAO.getAllMovie();
	}

	@Override
	public List<FilmModel> getMoviebyYear(int year) {

		return filmDAO.getAllMovieByYear(year);
	}

	@Override
	@Transactional
	public void InsertFilm(FilmModel film) {
	
		filmDAO.InsertFilm(film);
		
	}

	@Override
	@Transactional
	public void DeleteFilm(int filmid) {
		
		filmDAO.DeleteFilm(filmid);
		
	}

	@Override
	public FilmModel getFilm(int FilmId) {
		
		return filmDAO.getFilm(FilmId);
	}

	@Override
	@Transactional
	public void UpdateFilm(FilmModel film) {
		
		filmDAO.UpdateFilm(film);
		
	}

}
