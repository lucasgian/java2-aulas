// O Exercicio começa a partir da linha 18
// Criar um arquivo com o nome ProgramaPrincipal.java
public class Atividade3 {
    // Esse código esta correto
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1234, "João da Silva");
        ContaBancaria conta2 = new ContaBancaria(5678, "Maria Souza");

        conta1.depositar(1000);
        conta2.depositar(500);

        conta1.sacar(300);
        conta2.sacar(700);

        System.out.println("Saldo da conta 1: " + conta1.obterSaldo());
        System.out.println("Saldo da conta 2: " + conta2.obterSaldo());
    }
}

// Existem 10 erros
class ContaBancaria {
    // Atributos
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    public int getNumeroConta() { // 9 e 10 atributos precisam de metodo get e set
        return this.numeroConta;
    }

    public String getNomeTitular() {
        return this.nomeTitular;
    }

    // Método Construtor
    public ContaBancaria(int numeroConta, String nomeTitular) { // 1- Nome Construtor errado
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        // 2 e 3- faltou o this.
    }

    // Métodos
    public void depositar(double valorDeposito) { // 4 e 5 - Metodo é publico e Não tem retorno
        saldoAtual = saldoAtual + valorDeposito;
    }

    public void sacar(double valorSaque) { // 6 e 7 - Metodo é publico e Não tem retorno
        if (valorSaque > saldoAtual) {
            System.out.println("Saldo insuficiente");
        } else {
            saldoAtual = saldoAtual - valorSaque;
        }
    }

    public double obterSaldo() { // 8 - Metodo é publico e tem retorno
        return saldoAtual;
    }
}