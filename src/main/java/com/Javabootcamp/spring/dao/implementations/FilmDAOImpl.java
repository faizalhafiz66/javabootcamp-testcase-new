package com.Javabootcamp.spring.dao.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Javabootcamp.spring.dao.interfaces.FilmDAO;
import com.Javabootcamp.spring.models.FilmModel;



@Repository("FilmDAO")
public class FilmDAOImpl implements FilmDAO {

	@Autowired
	public SessionFactory factory;
	
	@Override
	public List<FilmModel> getAllMovie() {
		Session currentsession = factory.getCurrentSession();
		
		Query<FilmModel> query = currentsession.createQuery("from FilmModel as film "
				+  "order by filmid",FilmModel.class);

		List<FilmModel> result = query.getResultList();
		
		System.out.println(result);
		return result;
	}

	@Override
	public List<FilmModel> getAllMovieByYear(int Year) {
		
		Session currentsession = factory.getCurrentSession();
		
		Query<FilmModel> query = currentsession.createQuery("from FilmModel as film "
				+ "where film.release_year=: Year " + "order by filmid",FilmModel.class);

		List<FilmModel> resultwithYear = query.getResultList();
		
		return resultwithYear;
	}

	@Override
	public void InsertFilm(FilmModel film) {
		
		Session currentsession = factory.getCurrentSession();
		currentsession.saveOrUpdate(film);
		
	}

	@Override
	public void DeleteFilm(int filmid) {
	
		Session currentsession = factory.getCurrentSession();
		FilmModel models = (FilmModel) currentsession.load(FilmModel.class, new Integer(filmid));
		if (models != null) {
			currentsession.delete(models);
		}
		
		
	}

	@Override
	public FilmModel getFilm(int FilmId) {
		Session currentsession = factory.getCurrentSession();
		
		Query<FilmModel> query = currentsession.createQuery("from FilmModel as film "
				+ "where film.filmid=: FilmId " + "order by filmid",FilmModel.class);
		
		query.setParameter("FilmId", FilmId);
		
		List<FilmModel> result = query.getResultList();
		FilmModel model = result.get(0);
		
		
		return model;
	}

	@Override
	public void UpdateFilm(FilmModel film) {
		Session currentsession = factory.getCurrentSession();
		currentsession.saveOrUpdate(film);
		
	}

}
