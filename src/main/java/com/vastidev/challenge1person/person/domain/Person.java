package com.vastidev.challenge1person.person.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Getter
@Entity
public class Person {

    @Id
    private UUID idPerson;
    private String name;
    @NotNull
    private LocalDate birthDate;
    @NotNull
    @Embedded
    private MainAddress main_address;
    @Embedded
    private AddicionalAddress addicionalAdress;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;



    public Person(String name, @NotNull LocalDate birthDate, @NotNull MainAddress main_address, AddicionalAddress addicionalAdress) {
        this.idPerson = UUID.randomUUID();
        this.name = name;
        this.birthDate = birthDate;
        this.main_address = main_address;
        this.addicionalAdress = addicionalAdress;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public Person() {

    }
}
