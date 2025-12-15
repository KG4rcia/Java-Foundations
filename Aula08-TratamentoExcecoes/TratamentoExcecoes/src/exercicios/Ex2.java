package exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.print("Digite o índice que deseja acessar (0 a 4): ");

        try {
            int indice = sc.nextInt();
            System.out.println("Valor: " + numeros[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do limite do array.");
        }
    }
}
