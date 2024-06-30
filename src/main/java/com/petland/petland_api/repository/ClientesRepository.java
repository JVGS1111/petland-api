package com.petland.petland_api.repository;

import com.petland.petland_api.model.entities.CadastroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<CadastroEntity, Integer> {
}
