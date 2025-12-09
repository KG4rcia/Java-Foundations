package entidades;

public class Pedidos {
    private String nomeLanche;
    private int quantidadeLanche;
    private double precoLanche;
    private double total;

    public Pedidos(String nomeLanche, int quantidadeLanche, double precoLanche) {
        this.nomeLanche = nomeLanche;
        this.quantidadeLanche = quantidadeLanche;
        this.precoLanche = precoLanche;
        this.total = quantidadeLanche * precoLanche;
    }

    public String getNome() {
        return this.nomeLanche;
    }

    public double getPreco() {
        return this.precoLanche;
    }

    public int getQuantidade() {
        return this.quantidadeLanche;
    }

    public double getTotal() {
        return this.total;
    }

    public void setNome(String nome) {
        this.nomeLanche = nome;
    }

    public void setPreco(double preco) {
        this.precoLanche = preco;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setQuantidade(int quantidade) {
        this.quantidadeLanche = quantidade;
    }

    public String toString() {
        return " | " + this.nomeLanche
                + " | " + this.quantidadeLanche
                + " | R$ " + this.precoLanche
                + " | " + this.quantidadeLanche*this.precoLanche;
    }

}
