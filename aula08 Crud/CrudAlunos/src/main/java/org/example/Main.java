import org.example.entidades.Aluno;
import org.example.entidades.GerenciarAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciarAlunos GerenciarAlunos = new GerenciarAlunos();
        Aluno aluno1 = new Aluno("Diego", 10, 10);
        GerenciarAlunos.cadastrarAluno(aluno1);
        GerenciarAlunos.excluirAluno(1);

    }
}