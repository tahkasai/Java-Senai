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

    @GetMapping("/id")
    public Aluno BuscarAlunoId(@PathVariable Long id) {
        return alunoService.buscarAlunoId(id);
    }

    @PutMapping("/id")
    public Aluno atualizarAluno(@PathVariable Long id, @RequestBody Aluno alunoAtualizado) {
        Aluno verificaAluno = alunoService.buscarAlunoId(id);
        if (verificaAluno == null) return null;

        verificaAluno.setNomeAluno(alunoAtualizado.getNomeAluno());
        verificaAluno.setEmailAluno(alunoAtualizado.getEmailAluno());
        verificaAluno.setTelefoneAluno(alunoAtualizado.getTelefoneAluno());

        return alunoService.salvarAluno(alunoAtualizado);
    }

    @DeleteMapping("/id")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletarAluno(id);
    }

}
