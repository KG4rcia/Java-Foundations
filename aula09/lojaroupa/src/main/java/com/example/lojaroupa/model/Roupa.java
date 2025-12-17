package com.example.lojaroupa.model;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Informa qual tabela do banco se relaciona a entidde:
@Table(name = "roupa")
// Informa que a classe roupa é uma entidade JPA
// Mapear a Classe para o banco
@Entity(name = "Roupa")
// Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Roupa {
    @id // Informa que o id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Informa que o banco gera o id
    private int id;
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;
}