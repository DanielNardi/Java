package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{

    public ContaInvestimentoAltoRisco(double numeroConta, String saldo, double titular) {
        super(numeroConta, saldo, titular);
    }

    @Override
    public double sacar(double valor){
        if (valor >= 10000 && valor <= getSaldo()) {
            setSaldo(getSaldo() - (valor*1.05));
            System.out.println("Valor sacado: R$" + valor);
        }else{
            System.out.println("Saque não autorizado");
        }
        return valor;
    }
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
    }
}
