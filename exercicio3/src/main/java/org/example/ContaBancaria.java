package org.example;

public class ContaBancaria {

    double numeroConta;
    String titular;
    double saldo;


    public ContaBancaria(double numeroConta, String saldo, double titular) {
        this.numeroConta = numeroConta;
        this.saldo = Double.parseDouble(saldo);
        this.titular = String.valueOf(titular);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public double getNumeroConta() {
        return numeroConta;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    void depositar(double valor) {
        this.saldo += valor;
    }
    double sacar(double valor) {
        this.saldo -= valor;
        return valor;
    }
    void exibirInformacoes() {
        System.out.println("Conta: " + this.numeroConta);
    }

}
