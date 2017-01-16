package com.jstore.magazzino.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ubicazione {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String codUbi;

	public String getCodUbi() {
		return codUbi;
	}

	public void setCodUbi(String codUbi) {
		this.codUbi = codUbi;
	}
	
}
