package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um valor numerico: ");
            int valor = sc.nextInt();

            System.out.print("Digite um valor numerico: ");
            int valor2 = sc.nextInt();

            double divisao = valor / valor2;
            System.out.println("Resultado: " + divisao);

        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Erro informe um valor diferente de zero " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
