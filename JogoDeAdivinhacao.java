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
