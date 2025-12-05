package exercicios;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro galinhaPintadinha = new Livro(
                "Galinha Pintadinha",
                "Juliano Prado",
                "Ciranda Cultural",
                22.9,
                3
        );
        System.out.println(galinhaPintadinha.toString());
        galinhaPintadinha.devolverLivro(1);
        System.out.println(galinhaPintadinha.toString());

    }
}
