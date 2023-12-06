package com.polymorphism;

public class CompiletimePolymorphism {

    public static void method1(int a) {
        System.out.println("Single integer");

    }
    public static void method1(int a, int b) {
        System.out.println("Two integers");
    }

    public static void method1(String a) {
        System.out.println("Single string");
    }


    public static void main(String[] args) {
        method1(1);
        method1(1, 2);
        method1("Java");
        }

}
