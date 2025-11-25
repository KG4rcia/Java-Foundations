package Desafios;
import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o raio do circulo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2*Math.PI*raio;

        System.out.printf("\n========================\nÁrea: %.2f\nPerimetro: %.2f \n========================\n", area, perimetro);
    }
}
