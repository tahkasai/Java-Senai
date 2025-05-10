package com.kasai.Senai.Service;

import com.kasai.Senai.Interface.AlunoRepository;
import com.kasai.Senai.Model.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAlunos(){
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno){
        return alunoRepository.save(aluno);
    }
    public void deletarAluno(Long id){
        alunoRepository.deleteById(id);
    }

    public Aluno buscarAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }
}
