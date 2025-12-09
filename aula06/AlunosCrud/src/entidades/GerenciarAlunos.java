package entidades;

import java.util.ArrayList;

public class GerenciarAlunos {

    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("-> Nenhum aluno encontrado.");
        } else {
            System.out.println("| ID | NOME | NOTA 1 | NOTA 2 | MÉDIA");
            for (int i = 0; i < alunos.size(); i++) {
                System.out.println(i + alunos.get(i).toString());
            }
        }
    }

    public void atualizarAluno(int id, String nome, double nota, double nota2) {
        var aluno = alunos.get(id);
        aluno.setNome(nome);
        aluno.setNota(nota);
        aluno.setNota2(nota2);
        System.out.println("-> Aluno atualizados com sucesso!");
    }

    public void excluirAluno(int id) {
        alunos.remove(id);
        System.out.println("Aluno removido com sucesso.");
    }

}
