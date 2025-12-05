package exercicioPoo;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AlunoPoo aluno1 = new AlunoPoo();

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        System.out.print("Digite a primeira nota do aluno: ");
        double primeiraNota = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite a segunda nota do aluno: ");
        double segundaNota = sc.nextDouble();
        sc.nextLine();

        aluno1.nome = nomeAluno;
        aluno1.nota = primeiraNota;
        aluno1.nota2 = segundaNota;

        System.out.println("\n------------");
        System.out.println("-- Nome do aluno: " + aluno1.nome);
        System.out.println("-- Primeira nota do aluno: " + aluno1.nota);
        System.out.println("-- Segunda nota do aluno: " + aluno1.nota2);
        System.out.printf("-- A media é: %.2f", aluno1.calculaMedia());


    }
}
