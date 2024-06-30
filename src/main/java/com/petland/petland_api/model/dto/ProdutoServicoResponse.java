package com.petland.petland_api.model.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProdutoServicoResponse extends  ProdutoServicoRequest{

    private Integer id;


}
