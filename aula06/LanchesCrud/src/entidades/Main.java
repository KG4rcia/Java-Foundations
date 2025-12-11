package entidades;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaPedidos listaPedidos = new ListaPedidos();
        MenuLanches menu = new MenuLanches();
        int opcao;

        while (true) {
            System.out.println("----- MENU DE OPÇÕES -----");
            System.out.println("1. Fazer pedido.");
            System.out.println("2. Listar pedidos.");
            System.out.println("3. Editar pedidos.");
            System.out.println("4. Excluir pedidos.");
            System.out.println("5. Calcular pedido.");
            System.out.println("6. Sair do programa.");
            System.out.print("\n-> Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    menu.exibirCardapio();
                    System.out.print("Informe opção desejada: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();
                    var lancheEscolhido = menu.getCardapio(opcaoLanche);
                    System.out.print("\n-> Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedido pedido = new Pedido(lancheEscolhido.getNome(), quantidade, lancheEscolhido.getPrecoUnitario());
                    listaPedidos.addPedido(pedido);
                }
                case 2 -> {
                    listaPedidos.listarPedidos();
                }
                case 3 -> {
                    listaPedidos.listarPedidos();
                    System.out.print("\n-> Informe o ID do pedido que você deseja alterar: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    menu.exibirCardapio();
                    System.out.println("Informe para qual você quer substituir: ");
                    int novo_id = sc.nextInt();
                    var novo_lanche = menu.getCardapio(novo_id);
                    sc.nextLine();

                    System.out.println("Informe a nova quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    listaPedidos.alterarPedido(id, novo_lanche.getNome(), quantidade, novo_lanche.getPrecoUnitario());
                }
                case 4 -> {
                    listaPedidos.listarPedidos();;
                    System.out.print("Informe o ID do lanche que deseja remover: ");
                    int idLanche = sc.nextInt();
                    sc.nextLine();
                    listaPedidos.apagarPedido(idLanche);
                }
                case 5 -> {
                    listaPedidos.listarPedidos();
                    listaPedidos.calcularTotal();
                }
                case 6 -> {
                    System.out.println("\n---- ENCERRANDO ----\n");
                    return;
                }

            }
        }


    }
}
