import entidades.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria enzo = new ContaBancaria("Enzo", "802.291.588-20");

        System.out.println(enzo.getNome());
        System.out.println(enzo.getCpf());
        System.out.println(enzo.getSaldo());

        enzo.setNome("Enzo Souza");
        System.out.println(enzo.getNome());

        enzo.setCpf("802.291.588-20");
        System.out.println(enzo.getCpf());

        enzo.depositar(1000);
        enzo.sacar(500);
        System.out.println(enzo.getSaldo());
    }
}