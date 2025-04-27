import models.*;

public class Main {
    public static void main(String[] args) {

        Escola escola = new Escola("Escola Senai");

        Aluno aluno1 = new Aluno("Thais Pereira de Oliveira", 19, "A001");
        Aluno aluno2 = new Aluno("Stefany Vitória Alexandre Nascimento ", 19, "A002");
        Aluno aluno3 = new Aluno("Tainá Kasai Serafim", 19, "A003");
        Aluno aluno4 = new Aluno("Gabriele Monteiro Camargo", 24, "A004");

        Professor professor1 = new Professor("Francisco Oliveira","Java",55);

        Turma turma = new Turma("NONOA",2025,professor1);
        Disciplina disciplina = new Disciplina("História",50,professor1);

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarAluno(aluno3);

        escola.adicionarProfessor(professor1);

        escola.listaDeAlunos();
        System.out.println();
        escola.listaDeProfessores();
        System.out.println();
        escola.listaDisciplina();
        System.out.println();
        escola.listaTurmas();

    }
}