package com.petland.petland_api.atendimento.model.dto;

import com.petland.petland_api.atendimento.model.AtendimentoStatus;
import com.petland.petland_api.atendimento.model.AtendimentoTipo;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public class AtendimentoResponse extends  AtendimentoRequest{

    private Integer id;

}
