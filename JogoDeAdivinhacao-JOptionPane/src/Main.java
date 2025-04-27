import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe um número entre 1 e 100:");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");

        scanner.close();

    }
}