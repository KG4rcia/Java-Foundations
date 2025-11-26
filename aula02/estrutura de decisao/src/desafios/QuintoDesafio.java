package desafios;

import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do empréstimo: ");
        double emprestimo = sc.nextDouble();
        System.out.print("Informe o número de parcelas [6/12/24]: ");
        int num_parcelas = sc.nextInt();

        if (num_parcelas <= 6) {
            System.out.printf("\n-> Você tem %d parcelas, isso é 5%% do total de R$ %.2f sendo: %.2f", num_parcelas, emprestimo, emprestimo * 0.05);
        } else if (num_parcelas <= 12) {
            System.out.printf("\n-> Você tem %d parcelas, isso é 10%% do total de R$ %.2f sendo: %.2f", num_parcelas, emprestimo, emprestimo * 0.10);
        } else if (num_parcelas <= 24) {
            System.out.printf("\n-> Você tem %d parcelas, isso é 20%% do total de R$ %.2f sendo: %.2f", num_parcelas, emprestimo ,emprestimo * 0.20);
        } else {
            System.out.println("Escolha uma opção válida.");
        }

    }
}
