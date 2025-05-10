package com.senai.projeto.Controller;

import com.senai.projeto.Model.Aluno;
import com.senai.projeto.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Aluno> listar(){
        return service.listarTodos();
    }

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno){
        return service.salvar(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping("/vários")
    public List<Aluno> criarVarios(@RequestBody List<Aluno> alunos) {
        return service.salvarTodos(alunos);
    }

    @PutMapping("/{id}")
    public Aluno atualizar(@PathVariable Long id, @RequestBody Aluno novoaluno){
        Aluno alunoExistente = service.buscarPorId(id);
        if(alunoExistente == null) return null;

        alunoExistente.setNomeAluno(novoaluno.getNomeAluno());
        alunoExistente.setEmailAluno(novoaluno.getEmailAluno());
        alunoExistente.setTelefoneAluno(novoaluno.getTelefoneAluno());

        return service.salvar(alunoExistente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
