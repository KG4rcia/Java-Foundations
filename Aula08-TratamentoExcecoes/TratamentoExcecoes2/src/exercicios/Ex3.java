package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {10,20,30,40};

        System.out.println("Digite a posição de um valor na matriz: ");

        try {
            int posicao = sc.nextInt();
            System.out.println("Lista " + numeros[posicao]);
        } catch (InputMismatchException e) {
            System.out.println("Erro informe um valor numerico");
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("Programa finalizado");

    }
}
