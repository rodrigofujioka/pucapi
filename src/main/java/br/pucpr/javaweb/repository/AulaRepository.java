package br.pucpr.javaweb.repository;

import br.pucpr.javaweb.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQueries;
import java.util.List;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {

    @NamedNativeQu
    List<Aula> findAulaByAssunto(@Param("assunto") String assunto);

}
