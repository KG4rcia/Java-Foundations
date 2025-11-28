package desafio;
import java.util.Scanner;

public class PrimeiroDesafio {
    static void main(String[] args) {
        // Criar um programa q some 6 valores digitados pelo usuário.
        // Porém o programa só vai somar impares e multiplos de 3.
        Scanner sc = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i<6; i++) {
            System.out.print("Digite um número: ");
            int num = sc.nextInt();

            if (num % 2 != 0 && num % 3 == 0) {
                System.out.println("-> É impar e multiplo de 3");
                soma += num;
            }
        }
        System.out.printf("A soma de todos os impares que são múltiplos de 3 é: %d", soma);
    }
}