package fr.aoufi.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView visitHome() {
		return new ModelAndView("index");
	}
		
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public ModelAndView visitAdmin() {
		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Administrator home page");
		model.addObject("message", "You have been successfully logged in.");
		
		return model;
	}
}
