package org.example;

public class ContaInvestimento extends ContaBancaria{
    public ContaInvestimento(double numeroConta, String saldo, double titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public double sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - (valor*1.02));

        }else {
            System.out.println("Saldo insuficiente");
        }
        return valor;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
    }
}
