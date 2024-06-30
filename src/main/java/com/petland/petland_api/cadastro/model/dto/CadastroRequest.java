package com.petland.petland_api.cadastro.model.dto;

import com.petland.petland_api.cadastro.model.Endereco;
import com.petland.petland_api.cadastro.model.Perfil;
import lombok.Data;

@Data
public class CadastroRequest {

    private String nome;
    private Perfil perfil;
    private Endereco endereco;
}
