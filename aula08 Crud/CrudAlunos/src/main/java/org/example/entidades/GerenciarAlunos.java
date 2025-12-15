package org.example.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarAlunos {

    private final String url = "jdbc:mysql://localhost:3306/escola";
    private final String usuario = "root";
    private final String senha = "admin";

    //Metodo para conectar no banco de dados
    public Connection conectar() throws SQLException {
        return DriverManager.getConnection(url, usuario, senha);
    }

    // Cadastrar alunos:
    public void cadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos(nome, nota, nota2) VALUES (?, ?, ?)";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota());
            stmt.setDouble(3, aluno.getNota2());
            System.out.println("Cadastrado com sucesso");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void excluirAluno(int id) {
        String sql = "DELETE FROM alunos WHERE id = ?";
        try {
            Connection conexao = conectar();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Aluno excluido com sucesso.");

        } catch (SQLException e) {
            System.out.println("--ERRO: " + e.getMessage());
        }
    }

}