package com.corsojava.hello_thymeleaf;

public class Entity {
	private String nome;
	private String cognome;
	private boolean isLogged;
	
	public boolean isLogged() {
		return isLogged;
	}


	public void setLogged(boolean isLogged) {
		this.isLogged = isLogged;
	}


	public Entity(String nome, String cognome) {
		
		this.nome = nome;
		this.cognome = cognome;
	}


	public Entity(){
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
