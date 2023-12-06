package com.simple.program;

import java.util.Scanner;

public class PrimeNumber {

//prime is number divisible by 1 and itself

    private static void isPrime(int num) {

        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("Not a prime number" + i);
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime number");
        }
    }

    private static boolean isPrimeSquare(int num) {
        boolean isPrime = true;
        if (num ==1){
return false;
        }
        if(num ==2){
           return true;
        }
        for (int i = 3; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
       return true;
        }


    public static void main(String[] args) {

        isPrime(8);
        if(isPrimeSquare(3) ==false){
            System.out.println("Not Prime");
        }
        else
        System.out.println("Prime");
    }
}
