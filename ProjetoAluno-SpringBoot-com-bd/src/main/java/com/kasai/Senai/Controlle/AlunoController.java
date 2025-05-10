package com.kasai.Senai.Controlle;

import com.kasai.Senai.Model.Aluno;
import com.kasai.Senai.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
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

    @GetMapping("/{id}")
    public Aluno BuscarAlunoId(@PathVariable Long Id) {
        return alunoService.buscarAlunoId(Id);
    }

    @PutMapping("/{id}")
    public Aluno atualizarAluno(@PathVariable Long Id, @RequestBody Aluno alunoAtualizado) {
        Aluno verificaAluno = alunoService.buscarAlunoId(Id);
        if (verificaAluno == null) return null;

        verificaAluno.setNomeAluno(alunoAtualizado.getNomeAluno());
        verificaAluno.setEmailAluno(alunoAtualizado.getEmailAluno());
        verificaAluno.setTelefoneAluno(alunoAtualizado.getTelefoneAluno());

        return alunoService.salvarAluno(alunoAtualizado);
    }

    @GetMapping("/{id}")
    public void deletarAluno(@PathVariable Long Id) {
        alunoService.deletarAluno(Id);
    }

}
