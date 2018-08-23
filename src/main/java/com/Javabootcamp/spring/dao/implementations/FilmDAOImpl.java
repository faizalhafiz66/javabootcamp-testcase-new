package com.Javabootcamp.spring.dao.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Javabootcamp.spring.dao.interfaces.FilmDAO;
import com.Javabootcamp.spring.models.FilmModel;



@Repository
public class FilmDAOImpl implements FilmDAO {

	@Autowired
	public SessionFactory factory;
	
	@Override
	public List<FilmModel> getAllMovie() {
		Session currentsession = factory.getCurrentSession();
		
		Query<FilmModel> query = currentsession.createQuery("from film as film "
				+  "order by transactionDate",FilmModel.class);

		List<FilmModel> result = query.getResultList();
		
		return result;
	}

	@Override
	public List<FilmModel> getAllMovieByYear(int Year) {
		
		Session currentsession = factory.getCurrentSession();
		
		Query<FilmModel> query = currentsession.createQuery("from film as film "
				+ "where film.release_year=: Year " + "order by transactionDate",FilmModel.class);

		List<FilmModel> resultwithYear = query.getResultList();
		
		return resultwithYear;
	}

}
