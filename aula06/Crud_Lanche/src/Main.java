import java.util.GregorianCalendar;
import java.util.Scanner;
import entidades.Pedidos;
import entidades.GerenciarPedidos;

public class Main {
    static void main(String[] args) {
        GerenciarPedidos gerenciarPedido = new GerenciarPedidos();
        Scanner sc = new Scanner(System.in);

        System.out.print("\n===== SISTEMA DE PEDIDOS =====\n");
        while (true) {
            System.out.print("\nEscolha uma opção: \n");
            System.out.print("1. Pedir Lanche\n2. Exibir pedidos\n3. Editar pedido\n4. Remover pedido\n5. Calcular tudo\n6. Sair \n\n-> Sua escolha: ");
            int escolhaMenu = sc.nextInt();
            sc.nextLine();

            switch (escolhaMenu) {
                case 1 -> {
                    System.out.print("-> Informe o nome do lanche: ");
                    String nome = sc.nextLine();

                    System.out.print("-> Informe o preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("-> Informe a quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    Pedidos pedido = new Pedidos(nome, quantidade, preco);
                    gerenciarPedido.adicionarLanches(pedido);
                    System.out.println("Pedido registrado!\n");
                }

                case 2 -> {
                    gerenciarPedido.listarPedidos();
                }

                case 3 -> {
                    gerenciarPedido.listarPedidos();
                    System.out.print("\nInforme o ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("\nInforme o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("\nInforme a quantidade: ");
                    int quantidade = sc.nextInt();
                    gerenciarPedido.editarLanche(id, nome, quantidade);
                    gerenciarPedido.atualizarTotal();
                    sc.nextLine();
                }

                case 4 -> {
                    gerenciarPedido.listarPedidos();
                    System.out.print("Informe o ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    gerenciarPedido.removerLanche(id);
                }

                case 5 -> {
                    gerenciarPedido.listarPedidos();
                    System.out.printf("\n-> O valor total é: R$ " + gerenciarPedido.calcularTotal() + "\n");
                }

                case 6 -> {
                    System.out.println("\n-> Encerrando o programa...");
                    return;
                }

            }
        }


    }
}
