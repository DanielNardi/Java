package org.example;

public class ContaSalario extends ContaCorrente{
    public ContaSalario(double numeroConta, String saldo, double titular) {
        super(numeroConta, saldo, titular);
    }
    int quantidadeSaque;

    @Override
    public double sacar(double valor){
       if(valor <= getSaldo()){
           if (quantidadeSaque <=1){
               setSaldo(getSaldo() - valor);
               System.out.println("Saque realizado: R$ " + valor);
           }else {
               setSaldo((getSaldo()-5) - valor);
               System.out.println("Saque realizado com sucesso R$" + valor);
           }
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
