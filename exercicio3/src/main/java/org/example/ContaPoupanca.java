package org.example;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(double numeroConta, String saldo, double titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    void exibirInformacoes() {
        super.exibirInformacoes();
    }
    @Override
    double sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor insuficiente");
        } else if (valor > this.getSaldo()) {
            System.out.println("Valor insuficiente");
        } else {
            setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Novo saldo: R$ " + this.getSaldo());
        }
        return valor;
    }
}

