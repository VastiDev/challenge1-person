package com.vastidev.challenge1person.person.domain;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Value;
import org.intellij.lang.annotations.Pattern;
@Data
@Value
public class MainAddress {
    @Column(insertable=false, updatable=false)
    private String logradouro;
    @Column(insertable=false, updatable=false)
    @Pattern("\\d{5}-\\d{3}")
    private String cep;
    @Column(insertable=false, updatable=false)
    private String numero;
    @Column(insertable=false, updatable=false)
    private String cidade;
}
