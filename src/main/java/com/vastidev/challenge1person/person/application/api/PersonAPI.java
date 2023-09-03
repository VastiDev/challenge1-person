package com.vastidev.challenge1person.person.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/person")
public interface PersonAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PersonResponse postPerson(@Validated @RequestBody PersonRequest personRequest);

}
