package desafios;

import java.util.Scanner;

public class SextoDesafio {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Informe o valor: ");
        double valor = sc.nextDouble();
        System.out.print("Informe o método de pagamento:\n\n1. Dinheiro/Pix - 10% de Desconto.\n2. Débito - 5% de Desconto.\n3. Crédito.\n\n-> Sua escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("\nA sua conta de R$ %.2f com desconto de 10%% ganhou um desconto de %.2f, saindo por: R$ %.2f", valor, valor*0.10, valor-valor*0.10);
                break;
            case 2:
                System.out.printf("\nA sua conta de R$ %.2f com desconto de 5%% ganhou um desconto de %.2f, saindo por: R$ %.2f", valor, valor*0.05, valor-valor*0.05);
                break;
            case 3:
                System.out.printf("\n=== Escolha a forma: \n1. A vista - Valor: R$ %.2f\n2. Em 2x - 5%% de acrescimo - Valor: R$ %.2f \n3. Em 3x - 10%% de acrescimo - Valor: R$ %.2f\n\nSua escolha: ", valor,( valor+valor*0.05)/2, (valor+valor*0.10)/3);
                int opcao2 = sc.nextInt();
                switch (opcao2) {
                    case 1:
                        System.out.printf("\n-> A sua conta ficou %.2f", valor);
                        break;
                    case 2:
                        System.out.printf("\n-> A sua conta ficou %.2f", (valor+valor*0.5)/2);
                        break;
                    case 3:
                        System.out.printf("\n-> A sua conta ficou %.2f", (valor+valor*0.10)/3);
                        break;
                }
        }

    }
}
