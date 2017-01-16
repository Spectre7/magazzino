package com.jstore.magazzino.controller;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jstore.magazzino.domain.Articolo;
import com.jstore.magazzino.service.ArticoloService;

@Controller
public class ArticoloController {
	private final Logger logger = LoggerFactory.getLogger(ArticoloController.class); 
	
	@Autowired
	ArticoloService articoloService;

	@GetMapping("/insert")
	public String insertForm(Model model){
		model.addAttribute("articolo", new Articolo());
		return "insert";
	}
	
	@PostMapping("/insert")
	public String nuovoArticolo(@PathParam(value = "articolo") Articolo articolo){
		logger.info("nuovoArticolo controller called");		
		articoloService.save(articolo);		
		return "redirect:list";
	}
	
	@GetMapping("/list")
	public String findAll(Model model){
		model.addAttribute("articoli", articoloService.findAll());
		return "list";
	}
}
