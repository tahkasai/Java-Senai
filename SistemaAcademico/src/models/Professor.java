package models;

public class Professor {
    private String nomeProfessor;
    private String disciplina;
    private int idadeProfessor;

    public Professor(String nomeProfessor, String disciplina, int idadeProfessor) {
        this.nomeProfessor = nomeProfessor;
        this.disciplina = disciplina;
        this.idadeProfessor = idadeProfessor;
    }

    public String getNomeProfessor() {

        return nomeProfessor;
    }

    public String getDisciplina() {

        return disciplina;
    }

    public int getIdadeProfessor() {

        return idadeProfessor;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor" + nomeProfessor + '\'' +
                "disciplina" + disciplina + '\'' +
                "idadeProfessor" + idadeProfessor + "}";
    }
}