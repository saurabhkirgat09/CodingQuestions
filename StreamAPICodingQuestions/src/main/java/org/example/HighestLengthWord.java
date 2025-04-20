package org.example;

import java.util.Arrays;
import java.util.Comparator;


public class HighestLengthWord {

    public static void main(String[] args) {
        String input = "I am learning Streams API in Java";
        String[] arr = input.split(" ");

        String outPutWithTwoPointer = findMaxLengthWord(arr);
        String outPutWithStreams = findMaxLengthWordStreams(arr);

        System.out.println("The maximum length word with for impl: " + outPutWithTwoPointer);
        System.out.println("The maximum length word with Streams: " + outPutWithStreams);
    }

    private static String findMaxLengthWordStreams(String[] arr) {
        return Arrays.stream(arr)
                .max(Comparator.comparing(String::length))
                .orElse("");
    }

    private static String findMaxLengthWord(String [] arr) {
        int maxLength = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                maxIndex = i;
            }
        }
        return arr[maxIndex];
    }
}
