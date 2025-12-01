package DesafiosDoWhile;

import java.util.Enumeration;
import java.util.Scanner;

public class SextoDesafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
//        int num = sc.nextInt();
//        int casa = 1;
//        int soma = 0;
//        int digito = 0;
//
//        while (num > 0) {
//            digito = (int) (num % Math.pow(10, casa));
//            num -= digito;
//            digito = (int) (digito / Math.pow(10, casa-1));
//            soma += digito;
//            casa++;
//        }
//        System.out.println("A soma dos digitos é: " + soma);

        String numero = sc.nextLine();
        int soma = 0;
        int i = 0;

        while (i < numero.length()) {
            char c = numero.charAt(i);
            int digito = c - '0';
            soma += digito;
            i++;
        }
        System.out.println("A soma dos digitos é: " + soma);


    }
}
