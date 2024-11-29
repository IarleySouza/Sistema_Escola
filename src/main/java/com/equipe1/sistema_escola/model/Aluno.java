package com.equipe1.sistema_escola.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_aluno")
    private Long id;

    @Column(name = "nome_aluno")
    private String nome;

    @Column(name = "email_aluno")
    private String email;

    @Column(name = "data_nascimento_aluno")
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name= "professor_id", referencedColumnName = "pk_id_professor", nullable = false)
    @JsonBackReference
    private Professor professor;

    @ManyToOne
    @JoinColumn(name= "sala_id", nullable = false)
    private Sala sala;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}
