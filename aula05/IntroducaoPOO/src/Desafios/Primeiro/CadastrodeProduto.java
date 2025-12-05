package Desafios.Primeiro;

public class CadastrodeProduto {
    String nome;
    double preco;
    int quantidade;

    public double calcularTotal() {
        return preco*quantidade;
    }

}
