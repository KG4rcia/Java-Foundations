package entidades;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class GerenciarAlunos {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private DefaultTableModel modeloTabela;

    // Construtor recebe o modelo da tabela
    public GerenciarAlunos(DefaultTableModel modeloTabela) {
        this.modeloTabela = modeloTabela;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno encontrado!");
        } else {
            System.out.println("| id | nome | nota | nota | media |");
            for(int i = 0; i < alunos.size(); i++) {
                System.out.println("| " + i + alunos.get(i).toString());
            }
        }
    }

    public void atualizarAluno(int id, String nome, double nota, double nota2) {
        var aluno = alunos.get(id);
        aluno.setNome(nome);
        aluno.setNota(nota);
        aluno.setNota2(nota2);
        System.out.println("Aluno atualizado com sucesso!");
    }

    public void excluirAluno(int id) {
        alunos.remove(id);
        System.out.println("Aluno removido com sucesso!");
    }




}