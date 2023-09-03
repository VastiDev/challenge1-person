package com.vastidev.challenge1person.person.application.service;

import com.vastidev.challenge1person.person.application.api.PersonRequest;
import com.vastidev.challenge1person.person.application.api.PersonResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class PersonApplicationService implements PersonService {
    @Override
    public PersonResponse createPerson(PersonRequest personRequest) {
        log.info("[start] PersonApplicationService - createPerson");
        log.info("[finish] PersonApplicationService - createPerson");
        return null;
    }
}
