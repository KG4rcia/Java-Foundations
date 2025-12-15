package org.example;
import org.example.entidades.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciarAluno ga = new GerenciarAluno();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nSISTEMA ALUNOS (MySQL)");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String n = sc.nextLine();
                    System.out.print("Nota 1: ");
                    double n1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double n2 = sc.nextDouble();
                    ga.adicionarAluno(new Aluno(n, n1, n2));
                    break;

                case 2:
                    ga.listarAlunos();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int idA = sc.nextInt(); sc.nextLine();
                    System.out.print("Novo nome: ");
                    String nn = sc.nextLine();
                    System.out.print("Nova nota 1: ");
                    double nn1 = sc.nextDouble();
                    System.out.print("Nova nota 2: ");
                    double nn2 = sc.nextDouble();
                    ga.alterarAluno(idA, nn, nn1, nn2);
                    break;

                case 4:
                    System.out.print("ID para remover: ");
                    int idR = sc.nextInt();
                    ga.removerAluno(idR);
                    break;

                case 0:
                    return;
            }
        }
    }
}
