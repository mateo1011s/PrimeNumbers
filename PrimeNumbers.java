package com.example.primenumbers;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class PrimeNumbers {
    public static void main(String[] args) {
        int numberLimit;
        int i;
        int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("With these program you could known the prime numbers between 1 and your N number");
        System.out.println("→ Please enter the value of your number limit ");
        numberLimit=scanner.nextInt();
        System.out.println("The prime numbers between 1 and " + numberLimit + " are:");
        for (i=1;i<=numberLimit;i++) {
        boolean isPrime= true;
            for (j=2;j<=sqrt(i);j++){
                if (i%j==0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
            System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Thanks for using :) ");
    }
}
