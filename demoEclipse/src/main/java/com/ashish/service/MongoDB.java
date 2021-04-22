package com.ashish.service;

import com.ashish.command.Person;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class MongoDB implements PersonService{
    @Override
    public String register(Person person) {
        return "Your data has been send to MongoDB";
    }

    @Override
    public List<Person> getAllPerson() {
        return null;
    }
}
