package org.example;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(double numeroConta, String saldo, double titular) {
        super(numeroConta, saldo, titular);
    }

    double limite = 500;

    @Override
    public double sacar(double valor){
        if(valor <= getSaldo()+limite){
            if(valor > getSaldo()){
                double valorUsado;
                valorUsado = valor-getSaldo();
                setSaldo(0);
                limite -= valorUsado;
            }else {
                setSaldo(getSaldo()-valor);
            }
        } else {
            System.out.println("Saldo Insuficiente");
        }
        return this.getSaldo();
    }

    @Override
    void exibirInformacoes(){
        super.exibirInformacoes();
    }
}
