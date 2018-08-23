package com.Javabootcamp.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Javabootcamp.spring.models.FilmModel;
import com.Javabootcamp.spring.services.interfaces.FilmService;



@Controller
public class IndexController {

	@Autowired
	HttpSession httpSession;
	@Autowired
	FilmService FilmService;
	
	@RequestMapping("/list")
	public String showForm(Model myModel) {
		
		@SuppressWarnings("unused")
		List<FilmModel> filmModel = new ArrayList<FilmModel>();
		filmModel = FilmService.getAllMovie();		
		
		return "index";
	}
}
