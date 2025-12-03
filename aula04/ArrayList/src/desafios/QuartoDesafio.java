package desafios;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class QuartoDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        int posicao = 0;

        while (true) {
            posicao++;
            System.out.printf("\n-> Digite a palavra da posição %d ['sair' para encerrar]: ", posicao);
            String palavra = sc.nextLine().toLowerCase();

            if (palavra.equals("sair")) {
                System.out.println("-> Saindo...");
                break;
            }
            palavras.add(palavra);
        }
        System.out.println("-> Agora informe a letra que deseja filtrar da lista: ");
        String letra = sc.nextLine().toLowerCase();
        palavras.removeIf(itens -> itens.contains(letra));
        System.out.print("A sua lista de palavras ficou assim: ");
        System.out.print(palavras);
    }
}