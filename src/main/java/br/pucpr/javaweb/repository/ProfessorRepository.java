package br.pucpr.javaweb.repository;

import br.pucpr.javaweb.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {


}
