package com.simple.program;

public class InstanceAndLocalVariable {

    int id; // No need to initialize instance variable
    int id2;//id2 = 1000; Assignment statements cannot be at class level, it can only have declaration statemwnt
    void method1(){
        //int id1; will not work
        int id1=0; // need to be initialized or it will throw error
        id2=1000;// this is allowed
        System.out.println(id);
        System.out.println(id1);
        System.out.println(id2);
    }

    public static void main(String[] args){
        InstanceAndLocalVariable il = new InstanceAndLocalVariable();
        il.method1();
    }
}
