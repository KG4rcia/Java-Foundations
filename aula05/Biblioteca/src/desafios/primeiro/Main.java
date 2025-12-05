package desafios.primeiro;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a marca da roupa: ");
        String marcaRoupa = sc.nextLine();

        System.out.print("Informe o tipo da roupa: ");
        String tipoRoupa = sc.nextLine();

        System.out.print("Informe o tamanho[EX: P,M,G]: ");
        String tamanhoRoupa = sc.nextLine();

        System.out.print("Informe a quantidade: ");
        int quantidadeRoupa = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o valor: ");
        double valorRoupa = sc.nextDouble();
        sc.nextLine();

        Roupa roupa1 = new Roupa(marcaRoupa, tipoRoupa, tamanhoRoupa, quantidadeRoupa, valorRoupa);
        System.out.print(roupa1.ExibirEstoque());
        System.out.print(roupa1.DiminuirQuantidade(1));

        System.out.print(roupa1.ExibirEstoque());
        System.out.println(roupa1.AumentarQuantidade(2));
        System.out.print(roupa1.ExibirEstoque());

    }
}
