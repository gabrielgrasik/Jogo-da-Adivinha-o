import java.util.Scanner;
import java.util.Random;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int numeroDeTentativas = 5; 
        int tentativasRestantes = numeroDeTentativas; 
        int palpite; 
        boolean acertou = false; 

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Eu escolhi um número entre 1 e 100. Você tem " + numeroDeTentativas + " tentativas para adivinhar.");

        
        do {
            System.out.println("\nTentativas restantes: " + tentativasRestantes);
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número!");
                acertou = true; 
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor do que " + palpite);
            } else {
                System.out.println("O número é maior do que " + palpite);
            }

            tentativasRestantes--; 

        } while (!acertou && tentativasRestantes > 0); 

        if (!acertou) {
            System.out.println("Que pena! Você esgotou todas as suas tentativas.");
            System.out.println("O número correto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}