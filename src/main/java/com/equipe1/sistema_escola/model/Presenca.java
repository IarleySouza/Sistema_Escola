package com.equipe1.sistema_escola.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_presenca")
    private Long id;

    @Column(name = "data_presenca")
    private Date datapresenca;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Sala sala;

    @ManyToOne
    private Professor professor;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatapresenca() {
        return datapresenca;
    }

    public void setDatapresenca(Date datapresenca) {
        this.datapresenca = datapresenca;
    }
}
