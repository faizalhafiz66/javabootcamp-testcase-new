package com.Javabootcamp.spring.controller;

import java.util.ArrayList;
import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Javabootcamp.spring.models.FilmModel;
import com.Javabootcamp.spring.services.interfaces.FilmService;

@Controller
public class IndexController {

	@Autowired
	HttpSession httpSession;
	@Autowired
	FilmService filmService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String showForm(Model myModel) {
			
		List<FilmModel> filmModel = new ArrayList<FilmModel>();
		filmModel = filmService.getAllMovie();	
		
		myModel.addAttribute("models", filmModel);		
		return "index";
	}
	
	@RequestMapping("/form")
	public String showFormInsert(Model myModel) {
		
		FilmModel model = new FilmModel();
		myModel.addAttribute("models", model);
		return "transaction/insert";
	}
	
	@RequestMapping(value = "/form/insert", method=RequestMethod.POST)
	public String insertTransaction(@ModelAttribute("models") FilmModel film) {
		
		
		if (film.getFilmid() == 0)
		{
			filmService.InsertFilm(film);
		}
		else {		
			filmService.UpdateFilm(film);
			
		}		
		return "redirect:/list";
	}
	
	@RequestMapping("/form/delete/{filmid}")
	public String deleteTransaction(@PathVariable("filmid") int id) {
		
		filmService.DeleteFilm(id);
		return "redirect:/list";
	}
	
	@RequestMapping(value="/form/{filmid}", method=RequestMethod.GET)
	public String showUpdateFilmForm(@PathVariable("filmid") int id, Model myModel) {
		
		myModel.addAttribute("models", filmService.getFilm(id));
		myModel.addAttribute("listFilm", filmService.getAllMovie());
		
		return "transaction/insert";
	}
	
	
}
