package com.example.Ex9.Controller;

import com.example.Ex9.Banco.DepartamentoBd;
import com.example.Ex9.Banco.FuncionarioBd;
import com.example.Ex9.Model.Departamento;
import com.example.Ex9.Model.Funcionario;

import java.util.List;

public class FuncionarioController {

    FuncionarioBd repository = new FuncionarioBd();

    //buscar todos
    public List<Funcionario> getAll(){
        return repository.findAll();
    }

    public Funcionario getById(Long id){
        return repository.getById(id);
    }

    public List<Funcionario> getByCurso(String curso){
        return repository.findByCurso(curso);
    }

    public List<Funcionario> getByDepartamento(String departamentoNome){
        return repository.findByDepartamento(departamentoNome);
    }

    public boolean insert(Funcionario funcionario){
        return repository.insert(funcionario);
    }

    public Funcionario update(Long id, Funcionario funcionario){
        boolean result = repository.update(id , funcionario);

        if (result){
            return funcionario;
        }
        return null;
    }

}
