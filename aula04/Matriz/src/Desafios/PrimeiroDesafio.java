package Desafios;
import java.util.Scanner;

public class PrimeiroDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] pontuacao = new int[10];
        int soma = 0;

        for (int i = 0; i<pontuacao.length; i++) {
            System.out.printf("Insira a pontuação do estudando na posição %d: ", i);
            int ponto_estudante = sc.nextInt();
            soma += ponto_estudante;
            pontuacao[i] = ponto_estudante;
        }

        int posicao = 0;
        System.out.print("====================");
        for(int pontos : pontuacao) {
            posicao++;
            System.out.printf("\nA pontuação do estudante em %d° é: %d", posicao, pontos);
        }
        System.out.printf("\n\n-> A média total da pontuação dos estudantes é: %d", soma/pontuacao.length);
        System.out.print("\n====================");

    }
}
