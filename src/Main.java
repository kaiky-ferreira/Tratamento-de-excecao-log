import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva a quantidade de números que deseja digitar: ");

        try{
            int i = scanner.nextInt();
            int n[] = new int[i];
            for (int j = 0; j < i; j++) {
                System.out.print("Digite o número " + (j + 1) + ": ");
                n[j] = scanner.nextInt();
            }
        } catch (InputMismatchException e) {
            try (FileWriter writer = new FileWriter("log.txt", true)) {
                writer.write("Erro: O valor digitado não é um número inteiro." +  "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }
}