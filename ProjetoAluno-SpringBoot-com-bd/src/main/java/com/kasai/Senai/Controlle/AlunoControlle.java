package com.kasai.Senai.Controlle;

import com.kasai.Senai.Model.Aluno;
import com.kasai.Senai.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoControlle {
    private final AlunoService alunoService;

    public AlunoControlle(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listaDeAlunos() {
        return alunoService.buscarAlunos();
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.salvarAluno(aluno);
    }

    @GetMapping("/id")
    public Aluno BuscarAlunoId(Long Id){
        return alunoService.buscarAlunoId(Id);
    }

    @GetMapping("/id")
    public void deletarAluno(@PathVariable Long Id){
        alunoService.deletarAluno(Id);
    }



}
