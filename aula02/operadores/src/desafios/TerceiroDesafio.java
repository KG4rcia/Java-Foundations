package desafios;

import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o seu sexo[M/F]: ");
        String sexo = sc.nextLine();

        System.out.print("Informe o tempo de experiência em anos: ");
        int tempo_de_experiencia = sc.nextInt();
        sc.nextLine();

        if (sexo.equals("M") && idade < 25 && tempo_de_experiencia < 2) {
            System.out.println("-> Valor do seguro: R$ 2.000,00");
        } else if (sexo.equals("F") && idade < 25 && tempo_de_experiencia < 2) {
            System.out.println("-> Valor do seguro: R$ 1.800,00");
        } else {
            System.out.println("-> Valor do seguro: R$ 1.200,00");
        }


    }
}
