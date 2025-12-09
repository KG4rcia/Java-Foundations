import entidades.Carro;

public class Main {
    public static void main(String[] args) {
        Carro marca = new Carro("Ford Ka", 2015, 160);

        marca.setAno(1700);
        marca.setVelocidadeMaxima(0);
        marca.setModelo("       ");
        System.out.println(marca.toString());
    }
}