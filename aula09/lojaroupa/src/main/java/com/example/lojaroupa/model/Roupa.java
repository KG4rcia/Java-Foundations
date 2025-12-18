package com.example.lojaroupa.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Informa qual tabela do banco se relaciona a entidde:
@Table(name = "roupas")
// Informa que a classe roupa é uma entidade JPA
// Mapear a Classe para o banco
@Entity(name = "Roupa")
// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roupa {
    @Id // Informa que o id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa que o banco gera o id
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(DadosRoupa dadosRoupa) {
        this.marca = dadosRoupa.marca();;
        this.tipo = dadosRoupa.tipo();
        this.tamanho = dadosRoupa.tamanho();
        this.quantidade = dadosRoupa.quantidade();
        this.valor = dadosRoupa.valor();
    }
}