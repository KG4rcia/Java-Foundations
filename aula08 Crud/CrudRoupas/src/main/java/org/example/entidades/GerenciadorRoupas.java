package org.example.entidades;

import java.sql.*;

public class GerenciadorRoupas {
    private String url = "jdbc:mysql://localhost:3306/Loja";
    private String usuario = "root";
    private String senha = "admin";

    // Fazer a conexão;
    public Connection conectar() throws SQLException {
        System.out.println("--SUCESSO: Conexão realizada com sucesso");
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Cadastrar Roupa:
    public void cadastrarRoupa(Roupa roupa) {
        String cmd_sql = "INSERT INTO roupa(marca, tipo, tamanho, quantidade, valor) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(cmd_sql);

            stmt.setString(1, roupa.getMarca());
            stmt.setString(2, roupa.getTipo());
            stmt.setString(3, roupa.getTamanho());
            stmt.setInt(4, roupa.getQuantidade());
            stmt.setDouble(5, roupa.getPreco());
            System.out.println("--SUCESSO: Roupa cadastrada com sucesso.");
        } catch (SQLException e) {
            System.out.println("--ERRO: " + e.getMessage());
        }
    }
}
