package desafios.primeiro;

import java.util.ArrayList;
import java.util.Arrays;

public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String ExibirEstoque() {
        return "\n----Informações da roupa----\n" +
                "Marca: " + marca
                + " | Tipo: " + tipo
                + " | Tamanho: " + tamanho
                + " | Quantidde: " + quantidade
                + " | Valor: R$ " + valor;
    }

    public double ValorTotal() {
        return quantidade*valor;
    }

    public String AumentarQuantidade(int quantidade) {
        this.quantidade += quantidade;
        return "\n-> Agora há " + this.quantidade + " peças!";
    }

    public String DiminuirQuantidade(int quantidade) {
        if (this.quantidade < quantidade) {
            return "\n--ERRO: Não há unidades disponiveis";
        }
        this.quantidade -= quantidade;
        return "\n-> Agora há somente " + this.quantidade + " peças!";
    }
}
