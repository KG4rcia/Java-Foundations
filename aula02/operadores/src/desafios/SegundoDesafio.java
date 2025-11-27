package desafios;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o lado A: ");
        int lado_a = sc.nextInt();
        System.out.print("Informe o lado B: ");
        int lado_b = sc.nextInt();
        System.out.print("Informe o lado C: ");
        int lado_c = sc.nextInt();

        boolean lado_AB = lado_a + lado_b > lado_c;
        boolean lado_AC = lado_a + lado_c > lado_b;
        boolean lado_BC = lado_b + lado_c > lado_a;

        if (lado_AB && lado_AC && lado_BC) {
            if (lado_a == lado_b && lado_c == lado_a) {
                System.out.println("É Equilátero");
            } else if (lado_a == lado_b || lado_c == lado_a || lado_c == lado_b) {
                System.out.println("É Isósceles");
            } else {
                System.out.println("É Escaleno");
            }
        } else {
            System.out.println("Não é possivel formar um triângulo.");
        }



    }
}
