package exercicios;

import java.util.Scanner;

public class ExercicioFor {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;
        for (int i = 0; i<=6; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println("É par.");
                soma += num;
            }

        }

        System.out.printf("\n-> A soma de todos os valores pares é: %d", soma);

    }
}
