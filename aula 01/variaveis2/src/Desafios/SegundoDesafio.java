package Desafios;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o Capital Inicial?: ");
        double capital_inicial = scan.nextDouble();

        System.out.println("Qual o Taxa de Juros ao mês?: ");
        double taxa_juros = scan.nextDouble();

        System.out.println("Qual o número de meses?: ");
        int num_meses = scan.nextInt();

        System.out.printf("\n\n========================\nCapital Inicial: R$ %.2f\nTaxa de Juros ao mês: %.2f%%\nNúmero de meses: %d\nResultado: %.2f\n========================\n", capital_inicial, taxa_juros, num_meses, capital_inicial * Math.pow(1+taxa_juros, num_meses));

    }
}
