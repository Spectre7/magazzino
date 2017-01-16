package com.jstore.magazzino.repository;

import org.springframework.data.repository.CrudRepository;

import com.jstore.magazzino.domain.Articolo;

public interface ArticoloRepository extends CrudRepository<Articolo, Long> {

}
