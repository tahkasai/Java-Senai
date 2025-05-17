package com.senai.escola.service;


import com.senai.escola.Interface.AlunoRepository;
import com.senai.escola.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository _repository;

    public AlunoService(AlunoRepository repository) {
        this._repository = repository;
    }

    public List<Aluno> listarTodos() {
        return _repository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return _repository.save(aluno);
    }

    public void deletar(Long id) {
        _repository.deleteById(id);
    }

    public Aluno buscarById(Long id) {
        return _repository.findById(id).orElse(null);
    }

}
