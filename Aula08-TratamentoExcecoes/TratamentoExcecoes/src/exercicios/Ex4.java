package exercicios;

public class Ex4 {
    public static void main(String[] args) {

        try {
            String texto = "abc123";
            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Erro: formato inválido para número.");
        }
    }
}
