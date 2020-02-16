package com.spring.web.example.springWebTutorial.repository;

import com.spring.web.example.springWebTutorial.domain.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
