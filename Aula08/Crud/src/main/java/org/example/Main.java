package org.example;


import org.example.entidades.GerenciarAlunos;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos alunos = new GerenciarAlunos();

        try {
            alunos.conectar();
            System.out.println("Conectado com sucesso!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
