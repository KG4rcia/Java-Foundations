package entidades;
import java.util.ArrayList;

public class GerenciarPedidos {
    ArrayList<Pedidos> pedidos = new ArrayList<>();

    public void adicionarLanches(Pedidos lanchePedido) {
        pedidos.add(lanchePedido);
    }

    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("-> Não há pedidos.");
        } else {
            System.out.print("\n\nID | Nome | Quantidade | Preço | Total\n");
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println(i + pedidos.get(i).toString());
            }
        }
    }

    public void editarLanche(int id, String nome, int quantidade) {
        var lanche_editar = pedidos.get(id);
        lanche_editar.setNome(nome);
        lanche_editar.setQuantidade(quantidade);
        System.out.println("-> Pedido editado com sucesso.");
    }

    public void removerLanche(int id) {
        if (pedidos.isEmpty()) {
            System.out.println("-> Não há pedidos.");
        } else {
            pedidos.remove(id);
            System.out.println("\n-> Removido com sucesso.");
        }
    }

    public void atualizarTotal() {
        for (int i = 0; i != pedidos.size(); i++ ) {
            var preco = pedidos.get(i).getPreco();
            var quantidade = pedidos.get(i).getQuantidade();
            pedidos.get(i).setTotal(quantidade*preco);
        }

    }

    public double calcularTotal() {
        if (pedidos.isEmpty()) {
            System.out.println("-> Você não fez pedidos.");
            return 0;
        } else {
            double somaPedidos = 0;
            for (int i = 0; i != pedidos.size(); i++) {
                double precoTotal = pedidos.get(i).getTotal();
                somaPedidos += precoTotal;
            }
            return somaPedidos;
        }
    }


}
