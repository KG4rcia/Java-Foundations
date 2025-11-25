package Desafios;
import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a temperatura em Celsius: ");
        double temperatura_celsius = scan.nextDouble();

        System.out.printf("\n========================\nA temperatura informada foi: %.2f \n========================\n", temperatura_celsius);
        System.out.printf("\n========================\nA temperatura convertida para Fahrenheit é: %.2f \n========================\n", (temperatura_celsius*9/5) + 32);
        System.out.printf("\n========================\nA temperatura convertida para Kelvin é: %.2f \n========================\n", temperatura_celsius + 273.15);

    }
}
