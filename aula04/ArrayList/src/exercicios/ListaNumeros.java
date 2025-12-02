package exercicios;
import java.util.ArrayList;

public class ListaNumeros {
    static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (int x : numeros) {
            System.out.println(x);
        }

    }
}
