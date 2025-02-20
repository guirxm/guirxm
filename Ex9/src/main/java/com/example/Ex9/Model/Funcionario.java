package com.example.Ex9.Model;

public class Funcionario {
    private double salario;
    private Long id;
    private String nome;
    private String sobrenome;
    private String curso;
    private Departamento departamento;

    public Funcionario(double salario, Long id, String nome, String sobrenome, String curso, Departamento departamento) {
        this.salario = salario;
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.curso = curso;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
