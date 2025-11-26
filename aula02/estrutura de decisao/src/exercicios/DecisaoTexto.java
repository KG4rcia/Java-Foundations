package exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DecisaoTexto {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Você está grávida?: ");
        String resposta = scan.nextLine();

        if (resposta.equals("S")) {
            System.out.println("Não vai pagar");
        } else {
            System.out.println("Vai pagar");
        }








        scan.close();
    }
}
