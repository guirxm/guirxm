package com.example.Projeto.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Aluno {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @ManyToOne
    @JoinColumn(name = "idCurso", referencedColumnName = "idCurso")
    @JsonBackReference
    private Curso curso;


    private Long idAluno;

    private String nome;

    private String cpf;


    public Aluno(){
    }
    public Aluno(Long idAluno, String nome, String cpf, Curso curso) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
    }
    public Long getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Long idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }







}
