package com.simple.program;

import java.math.BigDecimal;

public class PrimitiveDataTypes {

    private static  int id;
    private static final float gpa = 7.5f; // always represent with f
    private static final double mark = 78.8888; // always double is recommended to use
    private static  char c = '\u0042'; //unicode

    public static void main(String[] args){
        System.out.println("id:"+id+"\ngpa:"+gpa+"\nmark:"+mark);
        //if we want exact results without rounding off then we should use BigDecimal instead of float and double
        BigDecimal first = new BigDecimal("0.112");
        BigDecimal second = new BigDecimal("99.6667");

        System.out.println("sum="+first.add(second));
        System.out.println(c);
    }
}
