package entidades;

public class Carro {
    private String modelo;
    private int ano;
    private double velocidadeMaxima;

    public Carro(String modelo, int ano, double velocidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {

        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Informe um modelo válido");
        } else {
            this.modelo = modelo;
        }

    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1886){
            this.ano = ano;
        } else {
            System.out.println("Informe ano maior que 1886");
        }
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima > 0) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("A velocidade deve ser maior que zero");
        }
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo +
                "\nAno: " + ano +
                "\nVelocidade Maxima: " + velocidadeMaxima;
    }
}
