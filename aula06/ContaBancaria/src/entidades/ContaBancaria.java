package entidades;

public class ContaBancaria {

    private String nome;
    private String cpf;
    private double saldo;

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setters
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Informe um valor válido");
        } else {
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            System.out.println("Informe um valor válido");
        } else {
            this.cpf = cpf;
        }
    }

    //Alterar saldo
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }
}
