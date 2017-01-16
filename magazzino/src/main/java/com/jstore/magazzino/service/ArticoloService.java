package com.jstore.magazzino.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jstore.magazzino.domain.Articolo;
import com.jstore.magazzino.repository.ArticoloRepository;

@Service
public class ArticoloService {
	Logger logger = LoggerFactory.getLogger(ArticoloService.class);
	
	@Autowired
	ArticoloRepository articoloRepository;
	
	public Iterable<Articolo> findAll(){
		logger.info("findAll requested");
		return articoloRepository.findAll();
	}
	
	public Articolo save(Articolo articolo){
		articoloRepository.save(articolo);
		return articolo;
	}
}
