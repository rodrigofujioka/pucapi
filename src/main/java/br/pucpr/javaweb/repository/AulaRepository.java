package br.pucpr.javaweb.repository;

import br.pucpr.javaweb.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import java.util.List;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Long> {

    @Query("select a from Aula a where a.assunto=:assunto")
    List<Aula> listarAulas(@Param("assunto") String assunto);

    List<Aula> listarAulasNativa();
    List<Aula> findAulaByAssunto(String assunto);
    List<Aula> findAulaByAssuntoOrderByIdDesc(String assunto);



}
