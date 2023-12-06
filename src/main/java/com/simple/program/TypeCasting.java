package com.simple.program;

public class TypeCasting {

    //Widening casting or automatic casting



    public static void main(String[] args){

        TypeCasting tc = new TypeCasting();

        tc.wideningCasting();
        tc.narrowCasting();
    }

    public  void wideningCasting(){

         int num = 10;
         double doubleNum = num;
        System.out.println("int="+num);
        System.out.println("double"+doubleNum);
    }

    public  void narrowCasting(){
        double doubleNum = 10.03d;
        int num = (int)doubleNum;


        System.out.println("double"+doubleNum);
        System.out.println("int="+num);
    }
}
