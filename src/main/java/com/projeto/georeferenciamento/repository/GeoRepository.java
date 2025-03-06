package com.projeto.georeferenciamento.repository;

import com.projeto.georeferenciamento.domain.Manifestacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeoRepository extends JpaRepository<Manifestacao, Long> {



}
