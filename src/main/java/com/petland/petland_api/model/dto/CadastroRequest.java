package com.petland.petland_api.model.dto;

import com.petland.petland_api.model.Endereco;
import com.petland.petland_api.model.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {

    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
