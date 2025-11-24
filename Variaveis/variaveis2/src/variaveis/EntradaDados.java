package variaveis;
import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        System.out.println("teste");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        System.out.println(nome);

        sc.nextLine();

        System.out.println("Digite seu nome completo: ");
        String nome_completo = sc.nextLine();
        System.out.println(nome_completo);

        // Método NextInt
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.printf("O %s tem %d anos", nome_completo, idade);

        // NextDouble
        System.out.println("\nDigite a sua altura: ");
        double altura = sc.nextDouble();
        //System.out.printf("O %s tem %d anos e " + altura + " de altura\n\n", nome_completo, idade);
        System.out.printf("O %s tem %d anos e %.2f de altura", nome_completo, idade, altura);
        sc.close();

        // NextBooleano

    }
}
