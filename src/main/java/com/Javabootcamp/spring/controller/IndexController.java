package com.Javabootcamp.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Javabootcamp.spring.models.FilmModel;
import com.Javabootcamp.spring.services.interfaces.FilmService;



@Controller

public class IndexController {

	@Autowired
	HttpSession httpSession;
	@Autowired
	FilmService FilmService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String showForm(Model myModel) {
		
	
		List<FilmModel> filmModel = new ArrayList<FilmModel>();
		filmModel = FilmService.getAllMovie();	
		
		myModel.addAttribute("models", filmModel);
		
		return "index";
	}
	
	@RequestMapping("/form")
	public String ShowFormInsert(Model myModel) {
		
		FilmModel model = new FilmModel();
		myModel.addAttribute("models", model);
		return "transaction/insert";
	}
	
	@RequestMapping(value = "/form/insert", method=RequestMethod.POST)
	public String InsertTransaction(@ModelAttribute("FilmModel") FilmModel film) {
		
		if (film.getFilmid() == 0)
		{
			FilmService.InsertFilm(film);
		}
		else {
		
		}
		
		return "redirect:/list";
	}
}
