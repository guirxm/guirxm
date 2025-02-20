package com.example.Ex9.Model;

public class Departamento {
    public Departamento(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
}
