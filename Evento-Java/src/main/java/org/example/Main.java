package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//Wordkshop
        System.out.println("Informe o nome:");
        String n = sc.nextLine();
        System.out.println("Informe a data: ");
        String data = sc.nextLine();

        Workshop workshop = new Workshop(n,data);
//Reunião
        System.out.println("Reunião publica (Sim) / Reunião privada (Não)");
        String privado = sc.nextLine();

        //Reunião privada
        if (privado.equals("Sim")) {
            Reuniao reuniao = new Reuniao(n, data, true, "1234");
        }else {
            Reuniao reuniao = new Reuniao(n, data, false, "NULL");
        }

    //Evento Corporativo

    }
}