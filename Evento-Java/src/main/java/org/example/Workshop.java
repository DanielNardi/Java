package org.example;

import java.util.ArrayList;

public class Workshop extends Evento{
    //atributo
    public ArrayList <String> listaParticipante = new ArrayList<>();

    //construtor

    public Workshop(String nome, String data) {
        super(nome, data);
    }

    //metodos

    public boolean inscreverParticipante(String nome){
        if(listaParticipante.size()<30){
            listaParticipante.add(nome);
            return true;
        }else{
            System.out.println("Número maximo de participantes atingidos.");
            return false;
        }
    }

    public void info(){
        System.out.println(nome);
        System.out.println(data);
        System.out.println("Nomes Participantes: ");
        for (int i = 0; i < listaParticipante.size(); i++) {
            System.out.println("Nome: " + listaParticipante.get(i));
        }
    }



}
