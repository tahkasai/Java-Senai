package com.senai.projeto.Service;

import com.senai.projeto.Interfaces.AlunoRepository;
import com.senai.projeto.Model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository _repository;

    public AlunoService(AlunoRepository repository) {
        this._repository = repository;
    }

    public List<Aluno> listarTodos(){
        return _repository.findAll();
    }

    public Aluno salvar(Aluno aluno){
        return _repository.save(aluno);
    }

    public void deletar(Long Id){
        _repository.deleteById(Id);
    }

    public Aluno buscarPorId(Long Id){
        return _repository.findById(Id).orElse(null);
    }

    public List<Aluno> salvarTodos(List<Aluno> alunos) {
        return _repository.saveAll(alunos); // aqui salva vários de uma vez
    }
}
