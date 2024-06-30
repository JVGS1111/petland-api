package com.petland.petland_api.cadastro.model.dto;

import com.petland.petland_api.cadastro.model.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;
}
