package Models;

public class Cliente extends Pessoa {
    private String planoCliente;

    // construtor
    public Cliente(String nome, int idade, String plano) {
        super(nome, idade);
        this.planoCliente = plano;
    }

    // getter
    public String getPlanoCliente() {
        return planoCliente;
    }

    // to string()
    @Override
    public String toString() {
        return "Cliente{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                ", planoCliente=" + planoCliente +
                '}';
    }
}
