package com.home.springboot.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.home.springboot.rest.domain.Person;
import com.home.springboot.rest.repository.PersonRepository;

import java.util.Optional;

@Service
@Transactional
public class PersonService {

	@Autowired 
	private PersonRepository repository;

	@Transactional(readOnly = true)
	public Page<Person> findAll(Pageable pageable) {
		
		return repository.findAll(pageable);
	}
	
	@Transactional(readOnly = true)
	public Person findOne(Long id) {

		Optional<Person> person = repository.findById(id);
		return person.isPresent() ? person.get() : null;
	}
	
	public Person save(Person person) {
		
		return repository.saveAndFlush(person);
	}
}
