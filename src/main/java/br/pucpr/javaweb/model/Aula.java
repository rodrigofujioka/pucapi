package br.pucpr.javaweb.model;

import javax.persistence.*;

@Entity//(name = "tb_aula")
public class Aula {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100)
    private String assunto;

    private String descricao;

    @Transient
    private String assuntoDescricao;



    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;


    public String getAssuntoDescricao(){
        this.assuntoDescricao = this.assunto + " - " + this.descricao;
        return this.assuntoDescricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
