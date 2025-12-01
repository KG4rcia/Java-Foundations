package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notas = new int[5];
        // Adicionar elementos na notas

        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 7;
        notas[3] = 8;
        notas[notas.length -1 ] = 6;

//        System.out.println(Arrays.toString(notas));
//        System.out.println(notas[0]);
//        System.out.println(notas[1]);
//        System.out.println(notas[2]);
//        System.out.println(notas[3]);
//        System.out.println(notas[4]);

        // Percorrer Array
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for (int nota : notas) {
            System.out.println(nota);
        }

        sc.close();
    }
}
