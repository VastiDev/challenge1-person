package com.vastidev.challenge1person.person.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;
@RestController
@Log4j2
public class PersonController implements PersonAPI {
    @Override
    public PersonResponse postPerson(PersonRequest personRequest) {
        log.info("[start] PersonController - postPerson");
        log.info("[finish] PersonController - postPerson");
        return null;
    }
}
