package variaveis;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();

        System.out.printf("\nA soma de ambos é: %d\n", numero + numero2);
        System.out.printf("A subtração de ambos é: %d\n", numero - numero2);
        System.out.printf("A multiplicação de ambos é: %d\n", numero * numero2);
        double divisao = (double) numero/numero2;
        System.out.printf("A divisão de ambos é: %.2f\n", divisao);

        // Módulo (%)
        System.out.printf("O resto da divisão de ambos é: %d\n", numero % numero2);


        sc.close();
    }
}
