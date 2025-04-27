package models;

public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;
    private Professor professor;

    public Disciplina(String nomeDisciplina, int cargaHoraria, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
    }

    public void exibirDetalhe(){
        System.out.println("Disciplina: " + nomeDisciplina);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Professor Responsável: " + professor.getNomeProfessor());
    }


}
