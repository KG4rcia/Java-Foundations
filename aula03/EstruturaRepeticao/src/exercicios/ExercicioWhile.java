package exercicios;

import java.util.Scanner;

public class ExercicioWhile {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número [Digite 999 para sair]: ");
            int numero = sc.nextInt();

            if (numero == 999) {
                break;
            }

            System.out.println(numero);
        }

    }
}
