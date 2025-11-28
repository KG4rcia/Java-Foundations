package DesafiosDoWhile;

import java.util.Scanner;

public class SegundoDesfio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num_usuario = sc.nextInt();

        // Antecessores:
        int primeiro_antecessor = num_usuario-1;
        int segundo_antecessor = primeiro_antecessor-1;

        for (int i = 0; i < num_usuario; i++) {
            System.out.println("..");
        }


    }
}
