package com.simple.program;

public class ReverseString {

    public static void main(String[] args) {

        String sentence = "Java is a programming language";
        System.out.println(reverseSentence(sentence));
    }

    private static String reverseSentence(String sentence) {

        String[] words = sentence.split("\\s");
        String reverse = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse = reverse + words[i];
        }
        return reverse;
    }
}
