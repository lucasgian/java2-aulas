// class ContaBancaria
/*
 * Propriedades: String numeroDaConta; String nomeCliente; int saldo;
 * 
 */


class ContaBancaria {
    String numeroConta;
    double saldo;
    String titular;
    double limiteSaque;

    public ContaBancaria(String numeroConta, String titular, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double quantia) {
        saldo += quantia;
    }

    public void saque(double quantia) {
        if (quantia > limiteSaque) {
            System.out.println("Erro: a quantia excede o limite de saque.");
        } else if (quantia > saldo) {
            System.out.println("Erro: saldo insuficiente.");
        } else {
            saldo -= quantia;
        }
    }

    public void imprimirInformacoes() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite de saque: R$" + limiteSaque);
    }
}

public class Exercicio {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(
            "12345-6", "João daSilva", 1000
        );

        conta1.deposito(500);
        conta1.saque(200);
        conta1.imprimirInformacoes();
    }
}