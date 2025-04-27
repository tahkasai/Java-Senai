package models;

import java.util.ArrayList;

public class Turma {
    private String nomeClasse;
    private int AnoLetivo;
    private Professor professor; // professor da lista de professores
    private ArrayList<Aluno> alunos;

    public Turma(String nomeClasse, int anoletivo, Professor professores) {
        this.nomeClasse = nomeClasse;
        this.AnoLetivo = anoletivo;
        this.professor = professores;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    public void listarAlunos(){
        System.out.println("Turma: "+nomeClasse+ " | Ano: ");
        System.out.println("Professor: "+ professor.getNomeProfessor());
        System.out.println("Alunos matriculados: ");

        for (Aluno aluno : alunos){
            System.out.println("- "+ aluno.getNomeAluno());
        }
    }
}
