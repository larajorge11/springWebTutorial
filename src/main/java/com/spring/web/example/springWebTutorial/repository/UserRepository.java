package com.spring.web.example.springWebTutorial.repository;

import com.spring.web.example.springWebTutorial.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
