package DesafiosDoWhile;
import java.util.Scanner;

public class TerceiroDesafio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int nota;
        int soma = 0;
        int qtd = 0;

        System.out.println("=========");
        do {
            System.out.print("Informe as notas [Digite 0 para encerrar]: ");
            nota = sc.nextInt();
            if (nota == 0) {
                System.out.println("Saindo...");
                break;
            } else {
                qtd += 1;
                soma += nota;
            }
        } while (nota != 0);
        if (soma != 0) {
            System.out.println("Calculando...");
            System.out.println("=========");
            System.out.printf("Média dos alunos: %d", soma/qtd);
        } else {
            System.out.println("=========");

        }
    }
}
