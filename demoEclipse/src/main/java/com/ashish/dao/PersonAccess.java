package com.ashish.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.bo.Person;

//person accessors will be putted here
public interface PersonAccess extends JpaRepository<Person, Integer> {
		
		

}
