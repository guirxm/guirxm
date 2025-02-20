package com.example.Ex9.Banco;

import com.example.Ex9.Model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class FuncionarioBd {

    private List<Funcionario> funcionarios;

    public FuncionarioBd(){
        this.funcionarios = new ArrayList<>();
    }

    //buscar todos

    public List<Funcionario> findAll(){
        return new ArrayList<>(funcionarios);
    }

    public List<Funcionario> findByCurso(String curso){
        return funcionarios.stream()
        .filter(funcionario -> funcionario.getCurso().equals(curso))
                .toList();
    }
    public List<Funcionario> findByDepartamento(String departamento){
        return funcionarios.stream()
        .filter(funcionario -> funcionario.getDepartamento().equals(departamento))
                .toList();
    }


    //buscar base no id

    public Funcionario getById(Long id){
        return funcionarios.stream()
                .filter( funcionario -> funcionario.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean insert(Funcionario funcionario){
        funcionarios.add(funcionario);
        return true;
    }

    //atualizar o funcionario

    public boolean update(Long id, Funcionario funcionario){
        Funcionario funcionarioBd = funcionarios.stream()
                .filter(fun -> fun.getId() == id)
                .findFirst()
                .orElse(null);

        if (funcionarioBd == null){
            return false;
        }

        funcionarioBd.setNome(funcionario.getNome());

        return true;
    }

}

