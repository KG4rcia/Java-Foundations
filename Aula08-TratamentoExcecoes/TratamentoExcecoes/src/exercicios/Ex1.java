package exercicios;
import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int n1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int n2 = sc.nextInt();

            int res = n1 / n2;
            System.out.println("Resultado: " + res);

        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida.");
        }
    }
}
