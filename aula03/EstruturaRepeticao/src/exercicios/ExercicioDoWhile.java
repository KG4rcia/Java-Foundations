package exercicios;
import java.util.Scanner;

public class ExercicioDoWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("-> Escolha uma opção: ");
            System.out.println("1. Continuar");
            System.out.println("2. Sair");
            opcao = sc.nextInt();

        } while (opcao == 1);
        System.out.println("Você saiu do programa.");
    }
}
