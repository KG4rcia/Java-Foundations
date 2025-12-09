import entidades.Aluno;
import entidades.GerenciarAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while (true) {
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - ATUALIZAR ALUNO");
            System.out.println("4 - REMOVER ALUNO");
            System.out.println("5 - SAIR DO PROGRAMA");
            System.out.println("ESCOLHA UMA OPÇÃO: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){

                case 1 -> {
                    System.out.println("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe a nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.println("Informe a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);
                }


            }

        }

    }
}