package com.petland.petland_api.atendimento.model.dto;

import com.petland.petland_api.atendimento.model.AtendimentoStatus;
import com.petland.petland_api.atendimento.model.AtendimentoTipo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AtendimentoRequest {

    private String descricao;
    private LocalDate data;
    private Double valor;
    private boolean emergencia;

    private AtendimentoTipo tipo;
    private AtendimentoStatus status;

    private Integer animal;
    private Integer produtoServico;
    private Integer cadastro;

}
