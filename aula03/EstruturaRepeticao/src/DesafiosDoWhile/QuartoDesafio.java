package DesafiosDoWhile;

import java.util.Scanner;

public class QuartoDesafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;

        while (true) {
            System.out.println("Informe um número: ");
            int numero = sc.nextInt();
            int resto = numero % 2;

            if (numero == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (resto == 0) {
                somaPar += numero;
            } else {
                somaImpar += numero;
            }
        }
        System.out.printf("================\n-> A soma de todos os pares é: %d", somaPar);
        System.out.printf("\n-> A soma de todos os impares é: %d \n================", somaImpar);
    }
}
