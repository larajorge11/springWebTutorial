package com.spring.web.example.springWebTutorial.repository;

import com.spring.web.example.springWebTutorial.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
