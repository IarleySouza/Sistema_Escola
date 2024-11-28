package com.equipe1.sistema_escola.repository;

import com.equipe1.sistema_escola.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor, Long> {
}
