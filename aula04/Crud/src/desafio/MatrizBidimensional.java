package desafio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MatrizBidimensional {
    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> menuLanches = new ArrayList<>(Arrays.asList(
                "X-Burguer",
                "X-Egg",
                "X-Bacon",
                "X-Salada",
                "X-Tudo"
        ));

        ArrayList<Double> menuPrecos = new ArrayList<>(Arrays.asList(
                22.9,
                24.9,
                26.9,
                26.9,
                29.9
        ));

        ArrayList<Double> listaValorTotal = new ArrayList<>();
        ArrayList<Double> listaValorUnitario = new ArrayList<>();
        ArrayList<Integer> listaQuantidade = new ArrayList<>();
        ArrayList<String> listaPedido = new ArrayList<>();

        int opcao;

        while (true) {

            System.out.println("\n-----SISTEMA DE PEDIDOS-----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - LISTAR PEDIDOS");
            System.out.println("3 - ATUALIZAR PEDIDO");
            System.out.println("4 - CANCELAR PEDIDO");
            System.out.println("5 - SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("-----CARDÁPIO-----");
                    for(int i = 0; i < menuLanches.size(); i++){
                        System.out.println(i + " - " +  menuLanches.get(i) +  " - " +  menuPrecos.get(i));
                    }

                    System.out.print("Informe o código do lanche: ");
                    int indiceLanche = sc.nextInt();
                    sc.nextLine();

                    String pedido = menuLanches.get(indiceLanche);

                    System.out.print("Informe a quantidade de lanches: ");
                    int quantidadeLanchesPedidos = sc.nextInt();
                    sc.nextLine();

                    double valorLanchePedido = menuPrecos.get(indiceLanche);

                    double valorTotalPedido = valorLanchePedido * quantidadeLanchesPedidos;

                    listaPedido.add(pedido);
                    listaValorUnitario.add(valorLanchePedido);
                    listaQuantidade.add(quantidadeLanchesPedidos);
                    listaValorTotal.add(valorTotalPedido);

                    System.out.println("Pedido realizado com sucesso");
                    break;

                case 2:
                    System.out.println("\n-----LISTA PEDIDOS-----");

                    if (listaPedido.isEmpty()) {
                        System.out.println("Nenhum pedido encontrado");
                    } else {
                        for (int i = 0; i < listaPedido.size(); i++) {
                            System.out.println("|" + i + "| Lanche: " +  listaPedido.get(i) +
                                    "| Quantidade: " + listaQuantidade.get(i) +
                                    "| Valor Unitário: " + listaValorUnitario.get(i) +
                                    "| Valor Total: " +  listaValorTotal.get(i) + "|");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n-----ATUALIZAR PEDIDO-----");
                    System.out.println("Informe o número do pedido: ");
                    int pedidoNumero = sc.nextInt();
                    sc.nextLine();

                    System.out.println("-----CARDÁPIO-----");
                    for(int i = 0; i < menuLanches.size(); i++){
                        System.out.println(i + " - " +  menuLanches.get(i) +  " - " +  menuPrecos.get(i));
                    }

                    System.out.println("Digite o código do lanche: ");
                    int opcaoLanche = sc.nextInt();
                    sc.nextLine();


                    String novoPedido = menuLanches.get(opcaoLanche);

                    System.out.print("Informe a quantidade de lanches: ");
                    int novaQuantidadeLanchesPedidos = sc.nextInt();
                    sc.nextLine();


                    double novoValorLanchePedido = menuPrecos.get(opcaoLanche);
                    sc.nextLine();

                    double novoValorTotalPedido = novoValorLanchePedido * novaQuantidadeLanchesPedidos;

                    listaPedido.set(pedidoNumero, novoPedido);
                    listaValorUnitario.set(pedidoNumero, novoValorLanchePedido);
                    listaQuantidade.set(pedidoNumero, novaQuantidadeLanchesPedidos);
                    listaValorTotal.set(pedidoNumero, novoValorTotalPedido);

                    System.out.println("Pedido Atualizado com sucesso");
                    break;

                case 4:
                    System.out.println("-----REMOVER PEDIDO-----");
                    System.out.println("Informe o número do pedido: ");
                    int numeroPedido =  sc.nextInt();
                    sc.nextLine();

                    listaQuantidade.remove(numeroPedido);
                    listaPedido.remove(numeroPedido);
                    listaValorTotal.remove(numeroPedido);
                    listaValorUnitario.remove(numeroPedido);
                    break;

                case 5:
                    System.out.println("Programa finalizado");
                    return;
            }


        }

    }
}
