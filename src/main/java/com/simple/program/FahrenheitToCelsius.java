package com.simple.program;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args){

        //double fahrenheit = 100.2;
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble();
        double celsius = (5*(fahrenheit - 32.0))/9.0;
        System.out.println(celsius);

    }
}
