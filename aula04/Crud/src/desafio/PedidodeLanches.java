package desafio;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PedidodeLanches {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lanches = new ArrayList<>();
        int opcao;

        while (true) {
            System.out.print("-> Escolha uma opção:\n\n1. Pedir lanche\n2. Listar todos os lanches que pediu\n3. Atualizar pedido\n4. Cancelar pedido\n5. Finalizar\n\n-> Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("-> Informe o nome do lanche: ");
                    String nome_lanche = sc.nextLine();
                    lanches.add(nome_lanche);
                    System.out.println("\n=========== PEDIDO CADASTRADO ===========\n");
                    break;
                case 2:
                    System.out.println("\n=========== ENTRANDO EM LISTAR PEDIDO ===========\n");
                    if (lanches.isEmpty()) {
                        System.out.println("-> ERRO: Você não fez nenhum pedido.");
                        System.out.println("\n=========== SAINDO DE LISTAR ===========\n");
                        break;
                    } else {
                        for (String lanche : lanches) {
                            System.out.println(lanches.indexOf(lanche) + " | " + lanche);
                        }
                        System.out.println("\n=========== SAINDO DE LISTAR PEDIDO ===========\n");
                        break;
                    }
                case 3:
                    System.out.println("\n=========== ALTERANDO PEDIDO ===========\n");
                    if (lanches.isEmpty()) {
                        System.out.println("-> ERRO: Você não fez nenhum pedido.");
                        System.out.println("\n=========== SAINDO DO ALTERAR PEDIDO ===========");

                        break;
                    }
                    System.out.println("-> Informe o ID do lanche: ");
                    int id_alterar = sc.nextInt();
                    sc.nextLine();
                    System.out.println("-> Informe o nome do lanche: ");
                    String nome_alterar = sc.nextLine();
                    lanches.set(id_alterar, nome_alterar);
                    break;
                case 4:
                    System.out.println("\n=========== APAGANDO PEDIDOS ===========\n");
                    if (lanches.isEmpty()) {
                        System.out.println("-> ERRO: Você não fez nenhum pedido.");
                        System.out.println("\n=========== SAINDO DO APAGAR PEDIRO ===========");
                        break;
                    }
                    System.out.println("Informe o ID do lanche: ");
                    int id_apagar = sc.nextInt();
                    sc.nextLine();
                    lanches.remove(id_apagar);
                case 5:
                    System.out.println("\n=========== SAINDO ===========");
                    return;
            }

        }


    }
}
