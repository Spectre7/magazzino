package com.jstore.magazzino;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jstore.magazzino.domain.Articolo;
import com.jstore.magazzino.repository.ArticoloRepository;


@SpringBootApplication
public class MagazzinoApplication {

	@Autowired
	ArticoloRepository articoloRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MagazzinoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(){
		return new CommandLineRunner(){

			@Override
			public void run(String... args) throws Exception {
				articoloRepository.save(new Articolo("articolo 1"));
				articoloRepository.save(new Articolo("articolo 2"));
				
			}};
	}
}
