package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("exemplo.xlsx", true);
            fw.write("Queijos Saborosos Manoel\n");
            fw.write("Queijo Palitinho\n");
            fw.write("Queijo Meia-Cura\n");
            fw.write("Queijo Nozinho\n");
            fw.write("Queijo Pimenta\n");
            fw.close();
            System.out.println("Programa finalizado, arquivo gerado");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
