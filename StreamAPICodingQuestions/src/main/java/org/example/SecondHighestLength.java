package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestLength {
    public static void main(String[] args) {
        String input = "I am learning Java from December";
        System.out.println("Second Largest Word in the String: " + calculateSecondHighestLengthWord(input));
        System.out.println("Second Largest word using two pointers: " + calculateSecondHighestWith2Pointer(input));
    }

    private static String  calculateSecondHighestLengthWord(String input) {
       return Arrays.stream(input.split(" "))
               .distinct()
               .sorted(Comparator.comparing(String::length).reversed())
               .skip(1)
               .findFirst()
               .orElse("");

    }

    private static String calculateSecondHighestWith2Pointer(String input) {
        String firstWord ="";
        String secondWord ="";
        for (String word: input.split(" ")){
            if (word.length()> firstWord.length()) {
                secondWord = firstWord;
                firstWord = word;
            } else if (word.length()> secondWord.length() && !word.equals(firstWord)) {
                secondWord = word;
            }
        }

        return secondWord;
    }
}
