package exercicio;

import java.util.Scanner;

public class Aluno  {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe sua nota: ");
        double nota1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Informe sua nota: ");
        double nota2 = sc.nextDouble();
        sc.nextLine();

        double media = (nota1 + nota2) / 2;
        System.out.print("\n-> Sua média foi: " + media);
        sc.close();
    }
}
