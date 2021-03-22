package br.pucpr.javaweb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina {

    @Id
    private Long id;

    private String nome;

}
