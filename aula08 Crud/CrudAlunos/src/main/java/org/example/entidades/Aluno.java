package org.example.entidades;

public class Aluno {
    private String nome;
    private double nota;
    private double nota2;

    public Aluno(String nome, double nota, double nota2) {
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setNome(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota+nota2)/2;
    }

    public String toString() {
        return " | " + nome + " | " + nota + " | " + nota2;
    }

}
