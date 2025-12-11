package entidades;
import java.util.ArrayList;

public class MenuLanches {
    private ArrayList<Lanches> cardapio = new ArrayList<>();

    // Inicializando instâncias da classe Lanches e adicionando diretamnte no ArrayList que guarda objetos.
    public MenuLanches() {
        cardapio.add(new Lanches("X-BURGUER", 20));
        cardapio.add(new Lanches("X-EGG", 24));
        cardapio.add(new Lanches("X-BACON", 26));
        cardapio.add(new Lanches("X-SALADA", 26));
        cardapio.add(new Lanches("X-FRANGO", 26));
        cardapio.add(new Lanches("X-TUDO", 30));
    }

    // Usando um for para iterar sobre o ArrayList e a cada iteração chamamos o método to.String()
    public void exibirCardapio() {
        System.out.println("---- MENU LANCHES ----");
        System.out.println("| ID | LANCHE | PREÇO UNITÁRIO");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println("| " + i + cardapio.get(i).toString());
        }
    }

    // Retornamos a instância que foi solicitada pelo usuário através do índice.
    public Lanches getCardapio(int i) {
        return cardapio.get(i);
    }

}
