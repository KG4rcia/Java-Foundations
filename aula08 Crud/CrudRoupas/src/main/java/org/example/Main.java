package org.example;

import org.example.entidades.GerenciadorRoupas;
import org.example.entidades.Roupa;

public class Main {
    static void main(String[] args) {
        GerenciadorRoupas gerenciador = new GerenciadorRoupas();
        Roupa roupa1 = new Roupa("Nike", "Camisa", "M", 2, 20);
        gerenciador.cadastrarRoupa(roupa1);
    }
}