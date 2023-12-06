package com.simple.program;

public class CommandLineArgument {


    public static void main(String[] args) {


        System.out.println(args[0]);
        int length = args.length;
        for (int i = 0; i < length; i++) {
            System.out.println("commandline arguments are" + args[i]);
        }


        int num = Integer.parseInt(args[0]);
        int square = num * num;
        System.out.println("square is:" + square);


    }
}