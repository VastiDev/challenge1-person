package com.vastidev.challenge1person.person.application.repository;

import com.vastidev.challenge1person.person.domain.Person;

public interface PersonRepository {
    Person save(Person person);
}
