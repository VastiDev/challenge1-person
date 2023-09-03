package com.vastidev.challenge1person.person.application.service;

import com.vastidev.challenge1person.person.application.api.PersonRequest;
import com.vastidev.challenge1person.person.application.api.PersonResponse;
import com.vastidev.challenge1person.person.application.repository.PersonRepository;
import com.vastidev.challenge1person.person.domain.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PersonApplicationService implements PersonService {
    private final PersonRepository personRepository;

    @Override
    public PersonResponse createPerson(PersonRequest personRequest) {
        log.info("[start] PersonApplicationService - createPerson");
        Person person = personRepository.save(new Person(personRequest));
        log.info("[finish] PersonApplicationService - createPerson");
        return PersonResponse.builder().idPerson(person.getIdPerson()).build();
    }
}
