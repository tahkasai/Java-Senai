package models;
import java.util.ArrayList;

public class Escola {
    private String nomeEscola;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;
    private ArrayList<Disciplina> disciplina;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
        this.alunos =  new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina){
        this.disciplina = disciplina;
    }

    public void setTurma(ArrayList<Turma> turma){
        this.turmas = turma;
    }

    public void listaTurmas(){
        System.out.println("Lista das turmas");
        for (Turma turma:turmas) {
            System.out.println(turma);
        }
    }

    public void listaDisciplina(){
        System.out.println("Lista das disciplinas");
        for (Disciplina disciplina:disciplina){
            System.out.println(disciplina);
        }
    }

    public void listaDeAlunos(){
        System.out.println("Lista de Alunos da escola");
        System.out.println("------------------------------------------");
        for(Aluno aluno:alunos){
            System.out.println(aluno);
        }
    }

    public void listaDeProfessores(){
        System.out.println("Lista de Professores da escola");
        System.out.println("-----------------------------------------");
        for(Professor professor:professores){
            System.out.println(professor);
        }
    }


}
