package br.pucpr.javaweb.model.dto;

import br.pucpr.javaweb.model.Aula;

public class AulaDto {

        private Long id;
        private String assunto;

    public AulaDto(Aula aula){
        this.id = aula.getId();
        this.assunto = aula.getAssunto();
    }


    public Long getId() {
        return id;
    }

    public String getAssunto() {
        return assunto;
    }


}
