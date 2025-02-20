package com.example.Ex9.Controller;

import com.example.Ex9.Banco.DepartamentoBd;
import com.example.Ex9.Model.Departamento;

import java.util.List;

public class DepartamentoController {

    DepartamentoBd repository = new DepartamentoBd();

    //buscar todos
    public List<Departamento> getAll(){
        return repository.findAll();
    }

    public Departamento getById(Long id){
        return repository.getById(id);
    }

    public boolean insert(Departamento departamento){
        return repository.insert(departamento);
    }

    public Departamento update(Long id, Departamento departamento){
        boolean result = repository.update(id , departamento);

        if (result){
            return departamento;
        }
        return null;
    }
}
