package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("saida.txt");
            writer.write("Olá, arquivo!\n");
            writer.write("Agora vai");
            writer.close();
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }
    }
}
