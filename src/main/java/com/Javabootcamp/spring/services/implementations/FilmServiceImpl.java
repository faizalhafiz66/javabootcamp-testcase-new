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
	private FilmDAO FilmDao;
	
	@Override
	
	public List<FilmModel> getAllMovie() {
		// TODO Auto-generated method stub
		return FilmDao.getAllMovie();
	}

	@Override
	public List<FilmModel> getMoviebyYear(int year) {
		// TODO Auto-generated method stub
		return FilmDao.getAllMovieByYear(year);
	}

	@Override
	public void InsertFilm(FilmModel film) {
	
		FilmDao.InsertFilm(film);
		
	}

	@Override
	public void DeleteFilm(FilmModel film) {
		
		FilmDao.DeleteFilm(film);
		
	}

	@Override
	public FilmModel getFilm(int FilmId) {
		
		return FilmDao.getFilm(FilmId);
	}

}
