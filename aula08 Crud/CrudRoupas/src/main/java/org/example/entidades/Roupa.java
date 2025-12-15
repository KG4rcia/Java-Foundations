package org.example.entidades;

public class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double preco;


    public Roupa(String marca, String tipo, String tamanho, int quantidade, double preco) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Getters:
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    // Setters:
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // ToString:
    public String toString() {
        return " | " + marca + " | " + tipo + " | " + tamanho + " | " + quantidade + " | " + preco;
    }
}
