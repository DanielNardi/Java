package org.example;
public class FizzBuzz {
    int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    public void executar(){
        Fizz fizz = new Fizz();
        Buzz buzz = new Buzz();

        for (int i = 1; i <= n; i++) {
            printFizzBuzz(i);
            fizz.printFizz(i);
            buzz.printBuzz(i);


            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }

    public void printFizzBuzz(int n) {
        if (n % 15 == 0) {
            System.out.println("FizzBuzz");
        }
    }

}
