package com.simple.program;

public class Swap2Numbers {


    private static void swapWith3Variable() {
        int x = 1;
        int y = 2;
        int z;

        z = x;
        x = y;
        y = z;

        System.out.println("x=" + x + "y=" + y);
    }

    private static void swapWithout3Variable() {
        int x = 1;
        int y = 2;

        x = x + y; //3
        y = x - y; //3-2 = 1
        x = x - y; //3-1 = 2


        System.out.println("x=" + x + "y=" + y);
    }

    public static void main(String[] args) {

        swapWith3Variable();
        swapWithout3Variable();
    }
}
