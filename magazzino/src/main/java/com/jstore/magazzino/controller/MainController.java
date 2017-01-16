package com.jstore.magazzino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


import com.jstore.magazzino.service.ArticoloService;

@Controller
public class MainController extends WebMvcConfigurerAdapter {
	
	@Autowired
	ArticoloService articoloService;
	
	@RequestMapping("/")
	public String getMenu(Model model){			
		model.addAttribute("articoli", articoloService.findAll());
		return "menu";
	}
}
