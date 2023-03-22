public class ProgramaPrincipal {
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

 class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldoAtual;

    public ContaBancaria(int numConta, String nomeTitular) {
        numeroConta = numConta;
        this.nomeTitular = nomeTitular;
    }

    public void depositar(double valorDeposito) {
        saldoAtual = saldoAtual + valorDeposito;
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldoAtual) {
            System.out.println("Saldo insuficiente");
        } else {
            saldoAtual = saldoAtual - valorSaque;
        }
    }

    public double obterSaldo() {
        return saldoAtual;
    }
}