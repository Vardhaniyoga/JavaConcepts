package com.polymorphism;

public class ChildRuntimePolymorphism extends RuntimePolymorphism{

    public static void main(String[] args){

        RuntimePolymorphism rp = new RuntimePolymorphism();
        String country1 = rp.getCountryName("India");

        String country2 = rp.getCountryName("Netherlands");

        System.out.println("country1" +country1);
        System.out.println("country2" +country2);
    }
}
