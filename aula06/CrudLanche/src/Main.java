import entidades.GerenciadorPedidos;
import entidades.MenuLanches;
import entidades.Lanche;
import entidades.Pedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorPedidos gerenciador = new GerenciadorPedidos();
        MenuLanches cardapio = new MenuLanches();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Total geral dos pedidos");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1 -> {
                    cardapio.exibirMenu();

                    System.out.print("Escolha o lanche pelo índice: ");
                    int indiceLanche = sc.nextInt();

                    if (indiceLanche < 0 || indiceLanche >= cardapio.tamanho()) {
                        System.out.println("Índice inválido.");
                        break;
                    }

                    Lanche lancheEscolhido = cardapio.getLanche(indiceLanche);

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    Pedido pedido = new Pedido(
                            lancheEscolhido.getNome(),
                            quantidade,
                            lancheEscolhido.getPreco()
                    );

                    gerenciador.adicionarPedido(pedido);
                }

                case 2 -> gerenciador.listarPedidos();

                case 3 -> {
                    gerenciador.listarPedidos();

                    System.out.print("Informe o índice do pedido: ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    cardapio.exibirMenu();
                    System.out.print("Escolha o novo lanche: ");
                    int novoIndice = sc.nextInt();
                    sc.nextLine();

                    Lanche novoLanche = cardapio.getLanche(novoIndice);

                    System.out.print("Nova quantidade: ");
                    int novaQuantidade = sc.nextInt();
                    sc.nextLine();

                    gerenciador.atualizarPedido(
                            indice,
                            novoLanche.getNome(),
                            novaQuantidade,
                            novoLanche.getPreco()
                    );
                }

                case 4 -> {
                    gerenciador.listarPedidos();
                    System.out.print("Informe o índice do pedido: ");
                    int indice = sc.nextInt();
                    gerenciador.removerPedido(indice);
                }

                case 5 -> {
                    double total = gerenciador.calcularTotalGeral();
                    System.out.printf("Total geral dos pedidos: R$ %.2f\n", total);
                }

                case 6 -> System.out.println("Encerrando o programa...");

                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
