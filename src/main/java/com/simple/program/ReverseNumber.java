package com.simple.program;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        int num = 1234;
        System.out.println(reverseNumber(num));
    }

    public static int reverseNumber(int num){
        int reverse = 0;

      while(num!=0){
          int digit = num%10;
          reverse = reverse * 10 + digit;
          num = num/10;
      }
        return reverse;
    }
}
