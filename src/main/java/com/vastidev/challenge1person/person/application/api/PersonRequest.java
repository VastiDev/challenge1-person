package com.vastidev.challenge1person.person.application.api;

import com.vastidev.challenge1person.person.domain.AddicionalAddress;
import com.vastidev.challenge1person.person.domain.MainAddress;
import jakarta.persistence.Embedded;
import lombok.Value;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;

@Value
public class PersonRequest {
    private String name;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    @Embedded

    private MainAddress main_address;
    @Embedded

    private AddicionalAddress addicionalAdress;
}
