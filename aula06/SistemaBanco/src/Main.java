import entidades.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Pedro");

        conta.depositar(100);
        conta.sacar(30);
        conta.sacar(200);

        System.out.println(conta.getSaldo());
    }
}
