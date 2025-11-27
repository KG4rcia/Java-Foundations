package desafios;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor total da compra: ");
        double valor_total = sc.nextDouble();

        System.out.print("Informe a quantidade de itens: ");
        int qtd_total_itens = sc.nextInt();
        sc.nextLine();

        if (valor_total > 1000) {
            System.out.printf("Você ganhou um desconto de 20%%: R$ %.2f", valor_total-valor_total*0.20);
        } else if (valor_total > 500 || qtd_total_itens > 5) {
            System.out.printf("Você ganhou um desconto de 10%%: R$ %.2f", valor_total-valor_total*0.10);
        } else if (valor_total > 300 || qtd_total_itens > 3) {
            System.out.printf("Você ganhou um desconto de 5%%: %.2f", valor_total-valor_total*0.05);
        } else {
            System.out.printf("Não tem desconto, a sua compra saiu por: R$ %.2f", valor_total);
        }


    }
}
