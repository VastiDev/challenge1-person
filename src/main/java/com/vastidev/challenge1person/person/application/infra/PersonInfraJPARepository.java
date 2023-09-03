package com.vastidev.challenge1person.person.application.infra;

import com.vastidev.challenge1person.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonInfraJPARepository extends JpaRepository<Person, UUID> {
}
