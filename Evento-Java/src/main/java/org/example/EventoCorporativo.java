package org.example;

public class EventoCorporativo extends Evento{
    //atributos
    public String reserva;
    public String ambiente;

    //construtor
    public EventoCorporativo(String nome, String data, String reserva, String ambiente) {
        super(nome, data);
        this.reserva = reserva;
        this.ambiente = ambiente;
    }

    //metodo

    public boolean validar(){
        if (!reserva.isEmpty()){
            System.out.println(ambiente + "reservado.");
            return true;
        } else {
            System.out.println("Nenhuma reserva");
            return false;
        }
    }

    public void infoEventoCorporativo(){
        System.out.println(nome);
        System.out.println(data);
        System.out.println(ambiente);
        System.out.println(reserva);
    }

}
