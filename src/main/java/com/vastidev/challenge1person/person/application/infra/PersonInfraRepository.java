package com.vastidev.challenge1person.person.application.infra;

import com.vastidev.challenge1person.handler.APIException;
import com.vastidev.challenge1person.person.application.repository.PersonRepository;
import com.vastidev.challenge1person.person.domain.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PersonInfraRepository implements PersonRepository {
    private final PersonInfraJPARepository personInfraJPARepository;

    @Override
    public Person save(Person person) {
        log.info("[start] PersonInfraRepository - save");
        try {
            personInfraJPARepository.save(person);
        }catch (DataIntegrityViolationException e){
            throw APIException.build(HttpStatus.BAD_REQUEST,
                    "person already exists,e");
        }
        log.info("[finish] PersonInfraRepository - save");
        return person;
    }
}
