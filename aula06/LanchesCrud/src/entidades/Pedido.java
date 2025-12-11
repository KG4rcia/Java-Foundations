package entidades;

public class Pedido {
    private String nomeLanche;
    private int quantidade;
    private double preco;


    public Pedido(String nomeLanche, int quantidade, double preco) {
        this.nomeLanche = nomeLanche;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters
    public String getNome() {
        return nomeLanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nomeLanche = nome;
    }

    // Calcular total
    public double calcularTotal() {
        return this.preco * this.quantidade;
    }

    public String toString() {
        return " | " + nomeLanche + " | " + quantidade + " | R$: " + preco + " | R$: " + calcularTotal();
    }

}
