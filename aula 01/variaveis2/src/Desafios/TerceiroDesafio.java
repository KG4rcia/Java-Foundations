package Desafios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Qual a primeira nota do aluno?: ");
        double nota1 = scan.nextDouble();

        System.out.print("Qual a segunda nota do aluno?: ");
        double nota2 = scan.nextDouble();

        System.out.print("Qual a terceira nota do aluno?: ");
        double nota3 = scan.nextDouble();

        System.out.printf("\n========================\nO aluno teve as notas: %.2f, %.2f, %.2f\nA sua média final é: %.2f\n========================", nota1, nota2, nota3, (nota1+nota2+nota3)/3);
    }
}
