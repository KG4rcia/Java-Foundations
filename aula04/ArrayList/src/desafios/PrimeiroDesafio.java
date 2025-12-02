package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class PrimeiroDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Kauan");
        nomes.add("Gustavo");
        nomes.add("Hugo");
        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Mariana");
        nomes.add("Paulo");
        nomes.add("Abelha");

        System.out.println("Informe a letra que deseja filtrar a lista: ");
        char letra = sc.nextLine().charAt(0);
        nomes.removeIf(itens -> itens.charAt(0) != letra);
        System.out.println(nomes);
        System.out.println(nomes.size());
    }
}
