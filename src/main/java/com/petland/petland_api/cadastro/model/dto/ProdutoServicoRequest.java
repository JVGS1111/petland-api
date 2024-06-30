package com.petland.petland_api.cadastro.model.dto;

import lombok.Data;

@Data
public class ProdutoServicoRequest {

    private String nome;
    private Double valor;
    private boolean servico;
}
