package com.jstore.magazzino.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Articolo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String codArt;
	
	public Articolo(){}
	
	public Articolo(String codArt) {
		super();
		this.codArt = codArt;
	}

	public Articolo(String codArt, Magazzino magazzino, Ubicazione ubicazione) {
		super();
		this.codArt = codArt;
		this.magazzino = magazzino;
		this.ubicazione = ubicazione;
	}

	@OneToOne
	private Magazzino magazzino;
	
	@OneToOne
	private Ubicazione ubicazione;
	

	public Magazzino getMagazzino() {
		return magazzino;
	}

	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	public Ubicazione getUbicazione() {
		return ubicazione;
	}

	public void setUbicazione(Ubicazione ubicazione) {
		this.ubicazione = ubicazione;
	}

	public String getCodArt() {
		return codArt;
	}

	public void setCodArt(String codArt) {
		this.codArt = codArt;
	}
}
