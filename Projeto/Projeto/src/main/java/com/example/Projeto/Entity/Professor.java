package com.example.Projeto.Entity;

import jakarta.persistence.*;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idProfessor;
    private String cpf;
    private  String nome;

    @OneToOne(mappedBy = "professor")
    private Curso curso;

    public Professor(Long idProfessor, String nome, String cpf) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.cpf = cpf;
    }
    public Professor(){

    }



    public Long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Long idProfessor) {
        this.idProfessor = idProfessor;
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




}
