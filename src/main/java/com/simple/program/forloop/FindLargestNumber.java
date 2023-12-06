package com.simple.program.forloop;

public class FindLargestNumber {

    private static int arr[] = {10, 30, 40, 50, 80};
    private static int largest = arr[0];

    private static int findLargest() {
        int arrlength = arr.length;
        for (int i = 0; i < arrlength; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;

    }

    private static int findLargestWithForEach() {

        for (int i : arr) {

            if (i > largest) {
                largest = i;

            }}
            return largest;
        }



    public static void main(String[] args) {

        int largestNumber = findLargest();
        System.out.println(largestNumber);
        System.out.println(findLargestWithForEach());
    }
}