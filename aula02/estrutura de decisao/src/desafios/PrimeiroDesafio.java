package desafios;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Aprovado com Distinção - excelente!");
        } else if (nota >= 7) {
            System.out.println("Aprovado - desempenho satisfatório");
        } else if (nota > 5) {
            System.out.println("Recuperação - dedicação é necessária");
        } else if (nota <= 5) {
            System.out.println("Reprovado - precisa melhorar muito");
        }

    }
}
