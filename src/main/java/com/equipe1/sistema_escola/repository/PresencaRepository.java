package com.equipe1.sistema_escola.repository;

import com.equipe1.sistema_escola.model.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long>  {
}
