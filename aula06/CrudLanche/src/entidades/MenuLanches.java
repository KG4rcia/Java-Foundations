package entidades;

import java.util.ArrayList;
import java.util.Arrays;

public class MenuLanches {

    private ArrayList<Lanche> lanches = new ArrayList<>();

    public MenuLanches() {
        // Cardápio fixo
        lanches.addAll(Arrays.asList(
                new Lanche("X-Burguer", 22.9),
                new Lanche("X-Egg", 24.9),
                new Lanche("X-Bacon", 26.9),
                new Lanche("X-Salada", 26.9),
                new Lanche("X-Tudo", 29.9)
        ));
    }

    public void exibirMenu() {
        System.out.println("\n===== MENU DE LANCHES =====");
        for (int i = 0; i < lanches.size(); i++) {
            System.out.println(i + " - " + lanches.get(i));
        }
    }

    public Lanche getLanche(int indice) {
        return lanches.get(indice);
    }

    public int tamanho() {
        return lanches.size();
    }
}

