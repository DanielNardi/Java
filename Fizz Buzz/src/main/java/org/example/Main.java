package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        System.out.println("Números divisíveis por 3 viram FIZZ");
        System.out.println("Números divisíveis por 5 viram BUZZ");

        FizzBuzz fizzBuzz = new FizzBuzz(n);

        fizzBuzz.executar();

    }
}
