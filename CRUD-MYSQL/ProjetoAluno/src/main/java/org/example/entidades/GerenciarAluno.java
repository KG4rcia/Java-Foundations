package org.example.entidades;

import java.sql.*;

public class GerenciarAluno {

    private final String URL = "jdbc:mysql://localhost:3306/escola";
    private final String USER = "root";
    private final String PASS = "";  // altere

    // Método para conectar
    private Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // -----------------------------
    // 1. ADICIONAR ALUNO
    // -----------------------------
    public void adicionarAluno(Aluno aluno) {

        String sql = "INSERT INTO aluno (nome, nota1, nota2) VALUES (?, ?, ?)";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());
            stmt.setDouble(2, aluno.getNota1());
            stmt.setDouble(3, aluno.getNota2());

            stmt.executeUpdate();

            System.out.println("Aluno cadastrado no banco com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno: " + e.getMessage());
        }
    }

    // -----------------------------
    // 2. REMOVER ALUNO
    // -----------------------------
    public void removerAluno(int id) {

        String sql = "DELETE FROM aluno WHERE id = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            System.out.println("Aluno removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover aluno: " + e.getMessage());
        }
    }

    // -----------------------------
    // 3. ALTERAR ALUNO
    // -----------------------------
    public void alterarAluno(int id, String nome, double nota1, double nota2) {

        String sql = "UPDATE aluno SET nome = ?, nota1 = ?, nota2 = ? WHERE id = ?";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setDouble(2, nota1);
            stmt.setDouble(3, nota2);
            stmt.setInt(4, id);

            stmt.executeUpdate();
            System.out.println("Aluno alterado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao alterar aluno: " + e.getMessage());
        }
    }

    // -----------------------------
    // 4. LISTAR ALUNOS
    // -----------------------------
    public void listarAlunos() {

        String sql = "SELECT * FROM aluno";

        try (Connection conn = conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            if (!rs.isBeforeFirst()) {
                System.out.println("Nenhum aluno cadastrado no banco.");
                return;
            }

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " - " +
                                rs.getString("nome") + " | " +
                                rs.getDouble("nota1") + " | " +
                                rs.getDouble("nota2")
                );
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }
    }
}
