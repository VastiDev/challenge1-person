package com.vastidev.challenge1person.person.domain;

import lombok.Data;
import lombok.Value;
import org.intellij.lang.annotations.Pattern;
@Data
@Value
public class MainAddress {
    private String logradouro;
    @Pattern("\\d{5}-\\d{3}")
    private String cep;
    private String numero;
    private String cidade;
}
