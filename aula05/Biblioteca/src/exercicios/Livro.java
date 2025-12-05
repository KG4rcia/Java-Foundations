package exercicios;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double precoUnitario;
    int quantidade;

    public Livro(String titulo, String autor, String editora, double precoUnitario, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String toString() {
        return "\n---Informações----\n"
                + "Livro: " + titulo
                + " | Autor: " + autor
                + " | Editora: " + editora
                + " | Preço Unitário: " + precoUnitario
                + " | Quantidade: " + quantidade;
    }


    public void alugarLivro(int quantidade) {
        if (quantidade > this.quantidade && this.quantidade <= 0) {
            System.out.println("\n-> Não há livros disponiveis.");
        } else {
            this.quantidade -= 1;
        }
    }

    public void devolverLivro(int quantidade) {
        if (quantidade > 0) {
            System.out.println("\n-> Livro devolvido com sucesso.");
            this.quantidade += quantidade;
        } else {
            System.out.println("\n-> Não há livros para devolver.");
        }

    }

    public double valorTotal() {
        return this.quantidade *  this.precoUnitario;
    }

}
