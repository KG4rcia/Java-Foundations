package entidades;

public class Pedido {

    private String lanche;
    private int quantidade;
    private double valorUnitario;

    public Pedido(String lanche, int quantidade, double valorUnitario) {
        setLanche(lanche);
        setQuantidade(quantidade);
        setValorUnitario(valorUnitario);
    }

    public String getLanche() {
        return lanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public double getValorTotal() {
        return quantidade * valorUnitario;
    }

    public void setLanche(String lanche) {
        if (lanche != null && !lanche.trim().isEmpty()) {
            this.lanche = lanche;
        } else {
            System.out.println("Nome do lanche inválido. O valor não foi alterado.");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Quantidade inválida. Deve ser maior que zero.");
        }
    }

    public void setValorUnitario(double valorUnitario) {
        if (valorUnitario > 0) {
            this.valorUnitario = valorUnitario;
        } else {
            System.out.println("Valor unitário inválido. Deve ser positivo.");
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s | Quantidade: %d | Unitário: R$ %.2f | Total: R$ %.2f",
                lanche, quantidade, valorUnitario, getValorTotal()
        );
    }
}
