package com.simple.program;

public class CompareTwoStrings {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "pyth";
        if (compareString(s1, s2) == true)
            System.out.println("Two strings are equal");
        else
            System.out.println("Strings are not equal");
    }


    private static boolean compareString(String s1, String s2) {

        if (s1 == null || s2 == null)
            return false;

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            char c2 = s2.charAt(i);
            char c1 = s1.charAt(i);
            if (c1 != c2)
                return false;
/*if(s1.compareTo(s2)==0){
    return true;*/

        }
        return true;
    }
}
