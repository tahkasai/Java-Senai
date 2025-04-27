import Models.Academia;
import Models.Cliente;
import Models.Instrutor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Academia academia = new Academia("Senai");

        Cliente cliente1 = new Cliente("Thais Pereira",19,"Premium");
        Cliente cliente2 = new Cliente("Tainá Kasai",19,"Básico");

        Instrutor instrutor1 = new Instrutor("Tiago Fonseca",34,"Java");
        Instrutor instrutor2 = new Instrutor("Lucas Daniel",25,"Python");

        academia.adicionarPessoa(cliente1);
        academia.adicionarPessoa(cliente2);
        academia.adicionarPessoa(instrutor1);
        academia.adicionarPessoa(instrutor2);

        academia.listarPessoas();

    }
}