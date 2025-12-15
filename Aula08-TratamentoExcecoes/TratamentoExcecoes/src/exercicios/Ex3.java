package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        try {
            File file = new File("dados.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro: arquivo não encontrado.");
        }
    }
}
