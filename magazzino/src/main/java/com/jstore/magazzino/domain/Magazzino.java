package com.jstore.magazzino.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magazzino {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String codMag;
	
	@OneToMany
	private List<Ubicazione> ubicazioni;
	
	
	public String getCodMag() {
		return codMag;
	}
	public void setCodMag(String codMag) {
		this.codMag = codMag;
	}
	public List<Ubicazione> getUbicazioni() {
		return ubicazioni;
	}
	public void setUbicazioni(List<Ubicazione> ubicazioni) {
		this.ubicazioni = ubicazioni;
	}


}
