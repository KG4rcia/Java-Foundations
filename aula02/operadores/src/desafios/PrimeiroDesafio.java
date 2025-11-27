package desafios;

import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o lado A: ");
        int lado_A = sc.nextInt();
        System.out.print("Digite o lado B: ");
        int lado_B = sc.nextInt();
        System.out.print("Digite o lado C: ");
        int lado_C = sc.nextInt();

        boolean lado_AB = lado_A + lado_B > lado_C;
        boolean lado_AC = lado_A + lado_C > lado_B;
        boolean lado_BC = lado_B + lado_C > lado_A;

        if (lado_AB && lado_AC && lado_BC) {
            System.out.println("-> É possivel formar um triangulo");
        } else {
            System.out.println("-> Não é possivel formar um triangulo");
        }

        sc.close();
    }
}
