package com.petland.petland_api.atendimento.repositories;

import com.petland.petland_api.atendimento.model.entity.AtendimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtendimentoRepository extends JpaRepository<AtendimentoEntity, Integer> {
}
