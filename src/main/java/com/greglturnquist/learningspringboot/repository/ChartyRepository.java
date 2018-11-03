package com.greglturnquist.learningspringboot.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.greglturnquist.learningspringboot.dao.Charty;

public interface ChartyRepository extends ReactiveCrudRepository<Charty, String> {

}
