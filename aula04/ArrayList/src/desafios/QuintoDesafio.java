package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class QuintoDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        ArrayList<String> par = new ArrayList<>();
        ArrayList<String> impar = new ArrayList<>();

        while (true) {
            System.out.print("\n-> Digite uma palavra['Sair' pra sair]: ");
            String palavra = sc.nextLine();

            if (palavra.equals("Sair") || palavra.equals("sair")) {
                System.out.println("-> Saindo...");
                break;
            }

            if (palavra.length() % 2 == 0) {
                par.add(palavra);
                palavras.add(palavra);

            } else {
                impar.add(palavra);
                palavras.add(palavra);
            }
                     
        }
        System.out.println("\nPalavras: " + palavras);
        System.out.println("Palavras pares: " + par);
        System.out.println("Palavras impares: " + impar);
    }
}
