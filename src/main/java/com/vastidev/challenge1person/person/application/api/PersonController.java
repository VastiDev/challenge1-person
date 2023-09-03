package com.vastidev.challenge1person.person.application.api;

import com.vastidev.challenge1person.person.application.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Log4j2
@RequiredArgsConstructor
public class PersonController implements PersonAPI {
    private final PersonService personService;

    @Override
    public PersonResponse postPerson(PersonRequest personRequest) {
        log.info("[start] PersonController - postPerson");
        PersonResponse createdPerson = personService.createPerson(personRequest);
        log.info("[finish] PersonController - postPerson");
        return createdPerson;
    }
}
