package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class TerceiroDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros_pares = new ArrayList<>();

        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        numeros.add(10);
        numeros.add(5);
        numeros.add(7);

        for (int x : numeros) {
            if (x % 2 == 0) {
                numeros_pares.add(x);
            }
        }

        System.out.printf("\n-> Lista original: ");
        System.out.print(numeros);
        System.out.printf("\n-> Lista atual somente com pares: ");
        System.out.print(numeros_pares);
    }
}
