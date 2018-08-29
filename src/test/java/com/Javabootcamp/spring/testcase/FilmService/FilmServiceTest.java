package com.Javabootcamp.spring.testcase.FilmService;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.Javabootcamp.spring.dao.interfaces.FilmDAO;
import com.Javabootcamp.spring.models.FilmModel;
import com.Javabootcamp.spring.services.implementations.FilmServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class FilmServiceTest {
	
	@Mock 
	FilmDAO filmdaoMock;
	
	@InjectMocks
	FilmServiceImpl filmServiceImpl;
	
	FilmModel sampleFilmModel = new FilmModel("testTitle", "test Description", 2015, "Sundanese");

	
	@Test
	public void testGetAllMovie() {
		
		@SuppressWarnings("unused")
		FilmModel testfilm = (FilmModel) filmServiceImpl.getAllMovie();
		//When(filmdaoMock.getAllMovieByYear(2015)).thenReturn("sampleFilmModel");
		
		
		
		
	}


}
