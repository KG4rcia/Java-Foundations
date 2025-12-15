package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GerenciarAlunos {

    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";

    //Metodo para conectar no banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }
}
