package DesafiosDoWhile;
import java.util.Scanner;
import java.util.SortedMap;

public class PrimeiroDesafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num_usuario = sc.nextInt();
        int somatoria = num_usuario;

        System.out.print("===========\n");

        for (int i = num_usuario; i != 1; i--) {
            System.out.println(somatoria + " x " + (i-1) + " = " + (i-1)*somatoria);
            somatoria *= i-1;
        }

        System.out.println("\n===========");
    }
}