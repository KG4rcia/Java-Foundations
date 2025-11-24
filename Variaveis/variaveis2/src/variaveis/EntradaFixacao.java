package variaveis;
import java.util.Scanner;

public class EntradaFixacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a sua cidade: ");
        String cidade = scan.nextLine();
        System.out.print("Digite o seu estado: ");
        String estado = scan.nextLine();

        System.out.printf("\nVocê mora em %s que fica no estado de %s.\n", cidade, estado);
        System.out.println("Qual a população da cidade?: ");
        int populacao_cidade = scan.nextInt();
        System.out.println("Qual o tamanho da cidade?: ");
        double tamanho_cidade = scan.nextDouble();
        System.out.printf("A sua cidade tem %d de pessoas, e tem um tamanho de %.2fkm²", populacao_cidade, tamanho_cidade);

        scan.close();
    }
}
