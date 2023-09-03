package com.vastidev.challenge1person.person.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class PersonResponse {

    private UUID idPerson;
}
