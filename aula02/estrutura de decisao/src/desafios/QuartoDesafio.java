package desafios;

import java.util.Scanner;

public class QuartoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double valor_usuario = sc.nextDouble();

        System.out.println("Agora escolha para o que quer converter:\n\n1. Dólar\n2. Euro\n3. Libra \n\nSua escolha: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.printf("O seu valor convertido em Dólar é: %.2f", valor_usuario * 0.20);
                break;
            case 2:
                System.out.printf("\nO seu valor convertido em Euro é: %.2f", valor_usuario * 0.18);
                break;
            case 3:
                System.out.printf("\nO seu valor convertido em Libra é: %.2f", valor_usuario * 0.15);
                break;
            default:
                System.out.printf("\n === Escolha uma opção válida === \n");
                break;
        }

//        if (opcao == 1) {
//            System.out.printf("O seu valor convertido em Dólar é: %.2f", valor_usuario * 0.20);
//        } else if (opcao == 2) {
//            System.out.printf("\nO seu valor convertido em Euro é: %.2f", valor_usuario * 0.18);
//        } else if (opcao == 3) {
//            System.out.printf("\nO seu valor convertido em Libra é: %.2f", valor_usuario * 0.15);
//        } else {
//            System.out.printf("\n === Escolha uma opção válida === \n");
//        }

        sc.close();
    }
}
