package entidades;

public class Lanches {
    // Atributos:
    private String nome;
    private double precoUnitario;

    // Construtor:
    public Lanches(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    // Getters para capturar informações de atributos privados.
    public String getNome() {
        return nome;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    // Setter - Atualizar os atributos privados.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    // Exibir informações do atributo:
    @Override
    public String toString() {
        return " | " + nome +
                " | R$: " + precoUnitario;
    }

}
