package entidades;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (this.nota + this.nota2) / 2;
    }

    @Override
    public String toString() {
        return " | " + this.nome + " | " + this.nota
                + " | " + this.nota2 + " | " +  this.calcularMedia() + " | ";
    }
}
