package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha qual tipo de reunião deseja:");
        System.out.println("1-Workshop");
        System.out.println("2-Reunião");
        System.out.println("3-Evento Corporativo");
        int x = sc.nextInt();
        sc.nextLine();
        String n,data;
//-----------------------------------------------------------------------------------------------
        switch(x) {
            case 1:
                //Wordkshop
                System.out.println("Informe o nome:");
                n = sc.nextLine();
                System.out.println("Informe a data: ");
                data = sc.nextLine();
                String participante;
                boolean y;

                System.out.println("Deseja continuar? (Não) para sair");
                Workshop workshop = new Workshop(n, data);
                do {

                    System.out.println("Participante:");
                    participante = sc.nextLine();


                    if (participante.equals("Não")) {
                        break;
                    }
                    y = workshop.inscreverParticipante(participante);

                } while (y);

                workshop.info();
                break;

//-----------------------------------------------------------------------------------------------
            case 2:
                //Reunião
                System.out.println("Informe o nome:");
                n = sc.nextLine();
                System.out.println("Informe a data: ");
                data = sc.nextLine();

                System.out.println("Reunião privada (Sim/Não)");
                String privado = sc.nextLine();

                boolean k;

                //Reunião privada
                k = privado.equals("Sim");

                Reuniao reuniao = new Reuniao(n, data, k, "1234");
                reuniao.infoReuniao();
                break;
//-----------------------------------------------------------------------------------------------
            case 3:

                System.out.println("Informe o nome:");
                n = sc.nextLine();
                System.out.println("Informe a data: ");
                data = sc.nextLine();

                //Evento Corporativo
                System.out.println("Informe a sala que deseja reservar: ");
                String sala = sc.nextLine();
                System.out.println("Ambiente:");
                String local = sc.nextLine();

                EventoCorporativo eventoCorporativo = new EventoCorporativo(n, data, sala, local);
                eventoCorporativo.infoEventoCorporativo();
                break;
        }

        }


}
