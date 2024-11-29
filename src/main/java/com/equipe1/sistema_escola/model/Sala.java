package com.equipe1.sistema_escola.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_sala")
    private Long id;

    @Column(name = "nome_sala")
    private String nome_sala;

    @Column(name = "capacidade")
    private Long capacidade;

    @OneToMany(mappedBy = "sala")
    @JsonIgnore
    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome_sala() {
        return nome_sala;
    }

    public void setNome_sala(String nome_sala) {
        this.nome_sala = nome_sala;
    }

    public Long getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Long capacidade) {
        this.capacidade = capacidade;
    }
}
