import entidades.GerenciarAlunos;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Crud Swing");
        frame.setSize(500, 500); //Tamanho da tela (largura, altura)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define que a janela será fechada ao clicar no X

        frame.setLayout(null); //Permite que você posicione os componentes manualmente, usando setBounds().
        frame.setResizable(false); //Não permite redimensionamento da tela


        //Adicionando um texto descritivo Nome
        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(20, 30, 50, 20); // Definindo posição e tamanho (x , y , Largura, Altura)
        frame.add(lblNome); //Adiciona na tela principal

        //Adicionando um campo de entrada Nome
        JTextField txtNome = new JTextField();
        txtNome.setBounds(80, 30, 360, 25);
        frame.add(txtNome);

        //Adicionando um texto descritivo Idade
        JLabel lblNota = new JLabel("Nota");
        lblNota.setBounds(20, 80, 50, 20);
        frame.add(lblNota);

        //Adicionando um campo de entrada Idade
        JTextField txtNota = new JTextField();
        txtNota.setBounds(80, 80, 360, 25);
        frame.add(txtNota);

        //Adicionando um texto descritivo Nota
        JLabel lblNota2 = new JLabel("Nota");
        lblNota2.setBounds(20, 130, 50, 20);
        frame.add(lblNota2);

        //Adicionando um campo de entrada Idade
        JTextField txtNota2 = new JTextField();
        txtNota2.setBounds(80, 130, 360, 25);
        frame.add(txtNota2);

        //Adicionando os botões
        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.setBounds(20, 180, 120, 30);
        frame.add(btnSalvar);

        //Adicionando os botões
        JButton btnEditar = new JButton("Editar");
        btnEditar.setBounds(170, 180, 120, 30);
        frame.add(btnEditar);

        //Adicionando os botões
        JButton btnExluir = new JButton("Excluir");
        btnExluir.setBounds(320, 180, 120, 30);
        frame.add(btnExluir);

        // Colunas corretas da tabela
        String[] colunas = {"ID", "Nome", "Nota 1", "Nota 2", "Média"};

        //  Modelo da tabela
        DefaultTableModel modeloTabela = new DefaultTableModel(colunas, 0);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos(modeloTabela);

        // Criando tabela
        JTable tabela = new JTable(modeloTabela);

        // Scroll
        JScrollPane scrollTabela = new JScrollPane(tabela);
        scrollTabela.setBounds(20, 230, 420, 200);

        frame.add(scrollTabela);


        btnSalvar.addActionListener(e -> {
            String nome = txtNome.getText();
            double nota1 = Double.parseDouble(txtNota.getText());
            double nota2 = Double.parseDouble(txtNota2.getText());
            double media = (nota1 + nota2) / 2;

            Object[] linha = {
                    modeloTabela.getRowCount() + 1, // ID automático
                    nome,
                    nota1,
                    nota2,
                    String.format("%.2f", media)    // formatação
            };

            modeloTabela.addRow(linha);


        });



        frame.setVisible(true); //Deixa a tela visivel

    }
}


