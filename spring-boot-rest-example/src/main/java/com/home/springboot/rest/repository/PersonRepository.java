package com.home.springboot.rest.repository;

import com.home.springboot.rest.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}