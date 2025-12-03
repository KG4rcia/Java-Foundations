package desafio;
import java.util.Scanner;
import java.util.ArrayList;

public class CrudAvancado {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();
        int opcao;

        while (true) {
            System.out.print("-> Escolha uma opção:\n\n1. Registrar ALuno\n2. Listar todos os Alunos\n3. Atualizar cadastro de Aluno\n4. Remover Aluno\n5. Finalizar\n\n-> Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Cadastrar Aluno:
                    System.out.print("Digite nome do aluno: ");
                    String nome_do_aluno = sc.nextLine();
                    System.out.print("Informe a idade do aluno: ");
                    int idade = sc.nextInt();
                    System.out.print("Informe a nota do aluno: ");
                    double nota = sc.nextInt();

                    nomesAlunos.add(nome_do_aluno);
                    idadeAlunos.add(idade);
                    notasAlunos.add(nota);
                    System.out.println("=== Aluno Registrado ===");
                    break;

                case 2:
                    // Listar alunos:
                    System.out.println("\n === LISTA DE ALUNOS ===");
                    if (nomesAlunos.isEmpty() && idadeAlunos.isEmpty() && notasAlunos.isEmpty()) {
                        System.out.println("-> Nenhum aluno foi adicionado");
                        break;
                    }
                    for (int i = 0; i < nomesAlunos.size(); i++) {
                        System.out.println("ID do Aluno: " + i +
                                " | Nome do aluno: "  + nomesAlunos.get(i) +
                                " | Idade do Aluno: " + idadeAlunos.get(i) +
                                " | Nota: " + notasAlunos.get(i));
                    }
                    break;

                case 3:
                    System.out.println("\n === ATUALIZAR CADASTRO ===");

                    System.out.println("Informe o ID do Aluno: ");
                    int id_aluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite o nome do Aluno: ");
                    String nome_aluno = sc.nextLine();


                    System.out.println("Digite a idade do Aluno: ");
                    int idade_aluno = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Digite a nota do Aluno: ");
                    double nota_aluno = sc.nextDouble();
                    sc.nextLine();

                    nomesAlunos.set(id_aluno, nome_aluno);
                    notasAlunos.set(id_aluno, nota_aluno);
                    idadeAlunos.set(id_aluno, idade_aluno);
                    System.out.println("\n-> Alterado com sucesso.");
                    break;

                case 4:
                    System.out.println("\n === EXCLUIR CADASTRO ===");
                    System.out.println("Digite o ID do aluno: ");
                    int id_remover = sc.nextInt();
                    sc.nextLine();
                    nomesAlunos.remove(id_remover);
                    notasAlunos.remove(id_remover);
                    idadeAlunos.remove(id_remover);
                    System.out.println("\n-> Excluido com sucesso.");
                    break;
                case 5:
                    System.out.println("\n === PROGRAMA ENCERRADO ===");
                    return;
            }
        }
    }
}
