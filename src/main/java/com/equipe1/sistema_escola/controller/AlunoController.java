package com.equipe1.sistema_escola.controller;

import com.equipe1.sistema_escola.model.Aluno;
import com.equipe1.sistema_escola.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@CrossOrigin
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno createAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }
    @PutMapping
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno alunoAtual = alunoRepository.findById(id).orElse(null);
        if (alunoAtual != null && aluno.getNome() != null) {
            alunoAtual.setNome(aluno.getNome());
            return alunoRepository.save(alunoAtual);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAluno(@PathVariable Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return ResponseEntity.ok( "Aluno deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno nao encontrado");
        }
    }
}
