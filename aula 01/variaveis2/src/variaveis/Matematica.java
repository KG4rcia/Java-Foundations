package variaveis;

public class Matematica {
    public static void main(String[] args) {
        // Potência

        int base = 2;
        int expoente = 3;
        double potencia = Math.pow(base, expoente);
        System.out.println("Potencia: " + potencia);


        // Raiz quadrada
        double numero = 16;
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("Raiz quadrada: " + raizQuadrada);

        // Random - Gerar valores aleatórios.
        double aleatorio = Math.random() * 1000;
        System.out.printf("Número aleatório: %.2f", aleatorio);
        int aleatorio2 = (int) (Math.random() * 10000);
        System.out.printf("\nNúmero aleatório convertido: %d", aleatorio2);

        // PI
        double pi = Math.PI;

    }
}