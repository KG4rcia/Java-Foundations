package exercicio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {
    static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.print("-> SISTEMA CRUD DE ALUNOS\n\nEscolha uma opção:\n1. Cadastrar Aluno\n2. Listar alunos\n3. Atualizar o cadastro do Aluno\n4. Remover Aluno do CRUD\n5. Sair\n\n-> Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\n-> Informe o nome do Aluno: ");
                    String nome_aluno = sc.nextLine();
                    nomes.add(nome_aluno);
                    System.out.println("\n=========== ALUNO CADASTRADO COM SUCESSO ===========\n");
                    break;
                case 2:
                    System.out.println("=========== LISTA DE ALUNOS ===========\n");
                    if (nomes.isEmpty()) {
                        System.out.println("-> Nenhum aluno encontrado...");
                        System.out.println("\n=========== LISTA DE ALUNOS ===========\n");
                        break;
                    } else {
                        for(String aluno : nomes) {
                            System.out.println("-> ID: " + nomes.indexOf(aluno) + " | " + aluno);
                        }
                        System.out.println("\n=========== LISTA DE ALUNOS ===========\n");
                        break;
                    }
                case 3:
                    System.out.println("\n=========== ATUALIZAR CADASTRO ===========\n");
                    System.out.print("-> Informe o ID do aluno: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("-> Informe o nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    nomes.set(id, nomeAluno);
                    break;
                case 4:
                    System.out.println("\n=========== REMOVER ALUNO ===========\n");
                    System.out.print("-> Informe o ID do aluno: ");
                    int id_remover = sc.nextInt();
                    sc.nextLine();
                    nomes.remove(id_remover);
                    break;
                case 5:
                    System.out.println("\n=========== Encerrando... ===========");
                    return;
            }
        }


    }
}
