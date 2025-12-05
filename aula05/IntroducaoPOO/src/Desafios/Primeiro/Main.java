package Desafios.Primeiro;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        CadastrodeProduto produto1 = new CadastrodeProduto();

        System.out.print("Informe o produto: ");
        produto1.nome = sc.nextLine();

        System.out.print("Informe a quantidade do produto: ");
        produto1.quantidade = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o valor do produto: ");
        produto1.preco = sc.nextInt();
        sc.nextLine();

        System.out.printf("\n-> O valor total do produto %s no estoque é: %.2f", produto1.nome, produto1.calcularTotal());
    }
}
