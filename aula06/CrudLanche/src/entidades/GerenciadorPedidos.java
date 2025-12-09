package entidades;

import java.util.ArrayList;

public class GerenciadorPedidos {

    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
            return;
        }

        System.out.println("\n===== LISTA DE PEDIDOS =====");
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(i + " - " + pedidos.get(i));
        }
    }

    public void atualizarPedido(int indice, String novoLanche, int novaQuantidade, double novoValorUnitario) {
        if (indice >= 0 && indice < pedidos.size()) {
            Pedido p = pedidos.get(indice);

            p.setLanche(novoLanche);
            p.setQuantidade(novaQuantidade);
            p.setValorUnitario(novoValorUnitario);

            System.out.println("Pedido atualizado com sucesso!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void removerPedido(int indice) {
        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
            System.out.println("Pedido removido!");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public double calcularTotalGeral() {
        double soma = 0;
        for (Pedido p : pedidos) {
            soma += p.getValorTotal();
        }
        return soma;
    }
}
