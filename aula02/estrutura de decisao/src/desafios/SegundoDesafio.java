package desafios;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a velocidade do carro: ");
        double velocidade = sc.nextDouble();

        if (velocidade > 90) {
            System.out.println("-> Limite ultrapassado\n");
            velocidade = (velocidade - 90) * 10;
            System.out.println("\n -> A sua multa é de: " + velocidade);
        } else {
            System.out.println("-> Limite não ultrapassado, pode seguir.");
        }

    }
}
