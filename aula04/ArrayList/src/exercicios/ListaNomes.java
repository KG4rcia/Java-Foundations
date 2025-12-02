package exercicios;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaNomes {
    static void main() {
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionar valores a arraylist
        nomes.add("Pedro"); // 0
        nomes.add("Diego"); // 1
        nomes.add("Maria"); // 2

        // Adicionar valor em uma posição especifica:
        nomes.add(0, "Kauan");
        nomes.add(1, "Maria");
        nomes.add("João");
        nomes.add("Joana");
        System.out.println(nomes);

        // Alterando valor:
        nomes.set(0, "Kawan");

        // Verificar se item exsite na lista:
        System.out.println(nomes.get(0));

        // Pegando o índice:
        System.out.println(nomes.indexOf("Kawan"));
        System.out.println(nomes.indexOf("Maria"));

        // remvover:
        System.out.println(nomes);
        System.out.println(nomes.remove(0));
        System.out.println(nomes);

        // verificar o tamanho da lista:
        System.out.println(nomes.size());

        // remove if:
        nomes.removeIf(itens -> itens.charAt(0) == 'J');

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
