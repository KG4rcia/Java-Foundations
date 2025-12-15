package exercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex5 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/teste",
                    "root",
                    "senha"
            );
            System.out.println("Conectado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar no banco de dados.");
        }
    }
}
