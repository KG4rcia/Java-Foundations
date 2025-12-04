package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lanches = new ArrayList<>();
        ArrayList<Integer> quantidade = new ArrayList<>();
        ArrayList<Double> preco_total = new ArrayList<>();
        String[] lanches_escolha = {"X-SALADA", "X-BURGER", "X-BACON", "X-EGG"};
        double[] preco_unitario = {18.00, 15.00, 21.00, 23.00};

        int opcao;

        while (true) {
            System.out.print("-> Escolha uma opção:\n\n1. Pedir lanche\n2. Listar todos os lanches que pediu\n3. Atualizar pedido\n4. Cancelar pedido\n5. Finalizar\n\n-> Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("-> Escolha um lanche: \n\n0. X-SALADA - R$ 18.00\n1. X-BURGER - R$ 15.00\n2. X-BACON - R$ 21.00\n3. X-EGG - R$ 23.00\n\n-> Sua escolha: ");
                    int num_lanche_pedido = sc.nextInt();
                    double valor_lanche_unitario = preco_unitario[num_lanche_pedido];
                    sc.nextLine();

                    System.out.print("-> Informe a quantidade: ");
                    int quantidade_lanche_pedidos = sc.nextInt();
                    sc.nextLine();
                    double total = valor_lanche_unitario*quantidade_lanche_pedidos;

                    quantidade.add(quantidade_lanche_pedidos);
                    lanches.add(lanches_escolha[num_lanche_pedido]);
                    preco_total.add(total);

                    System.out.printf("-> Tudo ficou: R$ %.2f", total);
                    System.out.println("\n=========== PEDIDO CADASTRADO ===========\n");
                    break;
                case 2:
                    System.out.println("\n=========== ENTRANDO EM LISTAR PEDIDO ===========\n");
                    if (lanches.isEmpty()) {
                        System.out.println("-> ERRO: Você não fez nenhum pedido.");
                        System.out.println("\n=========== SAINDO DE LISTAR ===========\n");
                        break;
                    } else {
                        for (int i = 0; i < lanches.size(); i++) {
                            double conversao_i = (double) (i);
                            System.out.printf("ID: %d | Lanche: %s | Quantidade: %d | Preço Unitário: %.2f | Preço Total: %.2f\n", i, lanches.get(i), quantidade.get(i), preco_unitario[i], preco_total.get(i));
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
                    System.out.println("-> Informe o ID do pedido: ");
                    int id_alterar = sc.nextInt();
                    sc.nextLine();

                    System.out.println("-> Escolha um lanche: \n\n0. X-SALADA - R$ 18.00\n1. X-BURGER - R$ 15.00\n2. X-BACON - R$ 21.00\n3. X-EGG - R$ 23.00\n\n-> Sua escolha ");
                    int num_lanche_alterar = sc.nextInt();

                    System.out.println("-> Informe a quantidade: ");
                    int qtd = sc.nextInt();

                    quantidade.set(id_alterar, qtd);
                    lanches.set(id_alterar, lanches_escolha[num_lanche_alterar]);
                    preco_total.set(id_alterar, qtd*preco_unitario[id_alterar]);
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
