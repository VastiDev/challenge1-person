package com.vastidev.challenge1person.person.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
@Table(name = "Pessoa")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "id", updatable = false, unique = true, nullable = false)
    private UUID idPerson;
    @Column(name = "Nome completo")
    private String name;
    @NotNull
    @Column(name = "Data Nascimento")
    private LocalDate birthDate;
    @NotNull
    @Embedded
    @Column(name = "Endereço Principal")
    private MainAddress main_address;
    @Embedded
    @Column(name = "Endereço Adicional")
    private AddicionalAddress addicionalAdress;

    private LocalDateTime dataHoraDoCadastro;
    private LocalDateTime dataHoraDaUltimaAlteracao;



    public Person(String name, @NotNull LocalDate birthDate, @NotNull MainAddress main_address, AddicionalAddress addicionalAdress) {
        this.name = name;
        this.birthDate = birthDate;
        this.main_address = main_address;
        this.addicionalAdress = addicionalAdress;
        this.dataHoraDoCadastro = LocalDateTime.now();
    }

    public Person() {

    }
}
