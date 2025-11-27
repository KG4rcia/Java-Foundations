package desafios;

import java.util.Scanner;

public class QuintoDesafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o login: ");
        String login_usuario = sc.nextLine();

        System.out.print("Informe a senha: ");
        String senha_usuario = sc.nextLine();

        if (login_usuario.length() >= 5 && senha_usuario.length() >= 8) {
            System.out.println("-> Registrado com sucesso.");
        } else {
            System.out.println("-> O login deve conter ao menos 5 caracteres e a senha 8.");
        }
    }
}
