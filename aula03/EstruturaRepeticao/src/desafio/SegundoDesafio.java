package desafio;
import  java.util.Scanner;

public class SegundoDesafio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random = (int) (Math.random() * 100);

        while (true) {
            System.out.println("Adivinhe o número que a máquina escolheu[0-100]: ");
            int num_usuario = sc.nextInt();

            if (num_usuario == random) {
                System.out.println("========\nParabéns, você venceu.\n========");
            } else if (num_usuario < random) {
                System.out.println("Calma lá, um pouco mais pra cima!");
            } else {
                System.out.println("Muito alto! Mais baixo!");
            }
        }
    }
}
