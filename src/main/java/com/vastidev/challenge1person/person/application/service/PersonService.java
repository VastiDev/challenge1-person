package com.vastidev.challenge1person.person.application.service;

import com.vastidev.challenge1person.person.application.api.PersonRequest;
import com.vastidev.challenge1person.person.application.api.PersonResponse;

public interface PersonService {
    PersonResponse createPerson(PersonRequest personRequest);
}
