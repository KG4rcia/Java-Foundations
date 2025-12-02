package desafios;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class SegundoDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("-> Informe o %d° número: ", i+1);
            int num = sc.nextInt();
            soma += num;
            numeros[i] = num;
        }

        System.out.print("====================\n");
        System.out.print("-> Números da lista: [");
        for (int x : numeros) {
            System.out.print(x + ",");
        }
        System.out.print("]");

        System.out.printf("\n-> A de todos os números é: %d\n-> A soma de todos os números é: %d\n", soma/numeros.length, soma);
        System.out.print("====================");

    }
}
