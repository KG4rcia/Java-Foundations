package desafios;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número entre 1-10: ");
        int num_usuario = sc.nextInt();
        int num_random = (int) ((Math.random() + 0.1) * 10);

        if (num_usuario == num_random) {
            System.out.println("\n === Você acertou ===\n");
        } else {
            System.out.println("=== Você errou ===");
        }

    }
}
