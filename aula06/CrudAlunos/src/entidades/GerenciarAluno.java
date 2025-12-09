package entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GerenciarAluno {
    private ArrayList<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno){
        listaAlunos.add(aluno);
        System.out.println("Aluno cadastrado com sucesso");
    }

    public void removerAluno(int id) {
        listaAlunos.remove(id);
        System.out.println("Aluno removido com sucesso");
    }

    public void alterarAluno (int id, String nome, double nota, double nota2){
        if (id >= 0 && id < listaAlunos.size()){
            Aluno aluno = listaAlunos.get(id);

            aluno.setNome(nome);
            aluno.setNota1(nota);
            aluno.setNota2(nota2);
        } else {
            System.out.println("Informe valores válidos");
        }
    }

    public void listarAlunos () {
        if (listaAlunos.isEmpty()){
            System.out.println("Lista vazia");
        } else {
            for(int i = 0; i < listaAlunos.size(); i++){
                System.out.println(i + listaAlunos.get(i).toString());
            }
        }
    }
}
