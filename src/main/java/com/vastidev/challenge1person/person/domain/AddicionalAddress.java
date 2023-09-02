package com.vastidev.challenge1person.person.domain;

import lombok.Data;
import lombok.Value;
import org.intellij.lang.annotations.Pattern;
@Value
@Data
public class AddicionalAddress {

    private String logradouro;
    @Pattern("\\d{5}-\\d{3}")
    private String cep;
    private String numero;
    private String cidade;

    public AddicionalAddress(String logradouro, String cep, String numero, String cidade) {

        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
    }
}
