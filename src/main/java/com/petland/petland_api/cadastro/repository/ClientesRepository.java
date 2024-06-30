package com.petland.petland_api.cadastro.repository;

import com.petland.petland_api.cadastro.model.entities.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<CadastroEntity, Integer> {
}
