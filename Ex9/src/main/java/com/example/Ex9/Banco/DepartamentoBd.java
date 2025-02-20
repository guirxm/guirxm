package com.example.Ex9.Banco;

import com.example.Ex9.Model.Departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoBd {

    private List<Departamento> departamentos;

    public DepartamentoBd(){
        this.departamentos = new ArrayList<>();
    }
    //buscar todos
    public List<Departamento> findAll(){
        return new ArrayList<>(departamentos);
    }

    //buscar com base no id

    public Departamento getById(Long id){
        return departamentos.stream()
                .filter( departamento -> departamento.getId() == id)
                .findFirst()
                .orElse(null);
    }

    //inserir departamento
    public boolean insert(Departamento departamento){
        departamentos.add(departamento);
        return true;
    }

    //atualizar o departamento

    public boolean update(Long id, Departamento departamento){
        Departamento departamentoBd = departamentos.stream()
                .filter(dep -> dep.getId() == id)
                .findFirst()
                .orElse(null);

        if (departamentoBd == null){
            return false;
        }

        departamentoBd.setNome(departamento.getNome());

        return true;
    }


}
