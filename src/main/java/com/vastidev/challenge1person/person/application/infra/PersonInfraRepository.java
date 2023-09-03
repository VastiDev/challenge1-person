package com.vastidev.challenge1person.person.application.infra;

import com.vastidev.challenge1person.person.application.repository.PersonRepository;
import com.vastidev.challenge1person.person.domain.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PersonInfraRepository implements PersonRepository {
    @Override
    public Person save(Person person) {
        log.info("[start] PersonInfraRepository - save");
        log.info("[finish] PersonInfraRepository - save");
        return null;
    }
}
