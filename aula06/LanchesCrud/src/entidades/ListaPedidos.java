package entidades;

import java.util.ArrayList;

public class ListaPedidos {
    private ArrayList<Pedido> pedidos = new ArrayList<>();


    public void addPedido(Pedido pedido) {
        if (pedido.getQuantidade() < 0 || !(pedido instanceof Pedido)) {
            System.out.println("\n--ERRO: Você não pode ter uma quantidade menor/igual a zero.");
        } else {
            pedidos.add(pedido);
            System.out.println("--SUCESSO: Pedido realiado com sucesso.");
        }
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("\n--ERRO: Você não fez nenhum pedido.");
        } else {
            System.out.println("---- PEDIDOS ----");
            System.out.println("| ID | LANCHE | QUANTIDADE | PREÇO UNITÁRIO | PREÇO TOTAL");
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println("| " + i + pedidos.get(i).toString());
            }
        }
    }

    public void alterarPedido(int id_alterar, String nome, int quantidade, double preco) {
        var pedido_alterar = pedidos.get(id_alterar);

        pedido_alterar.setNome(nome);
        pedido_alterar.setPreco(preco);
        pedido_alterar.setQuantidade(quantidade);
        System.out.println("\n--SUCESSO: Lanche alterado com sucesso.\n");
    }

    public void apagarPedido(int id) {
        pedidos.remove(id);
        System.out.println("\n--SUCESSO: Removido com sucesso.");
    }

    public double calcularTotal() {
        double soma = 0;
        if (pedidos.isEmpty()) {
            return 0.0;
        }

        for (Pedido pedido : pedidos) {
            soma += pedido.calcularTotal();
        }
        System.out.print("-> O total é: " + soma + "\n\n");;
        return soma;
    }

}
