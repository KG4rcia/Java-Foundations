package exercicios;

import java.util.Scanner;

public class VerificaNota {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        int nota = sc.nextInt();

        if (nota >= 70) {
            System.out.println("Aprovado");
        } else if (nota >= 50) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();

    }
}
