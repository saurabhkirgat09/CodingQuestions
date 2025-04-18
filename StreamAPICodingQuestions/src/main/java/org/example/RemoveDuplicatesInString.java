package org.example;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String input = "bcdedbsfesd";
        System.out.println(" String after removing duplicates: " + removeDuplicateCharsJava8(input));
        System.out.println(" Removed duplicates with Set: " + removeDuplicatesWithSet(input));
    }

    private static String removeDuplicateCharsJava8(String input) {
        return input.chars() //provides InputStream
                .distinct()  // Apply distinct to remove duplicates
                .mapToObj((c) -> String.valueOf((char) c)) //convert ascii codes into char first then String
                .collect(Collectors.joining()); //Join all the characters to Complete String
    }

    private static String removeDuplicatesWithSet(String input) {
        Set<Character> uniqueSet = new LinkedHashSet<>(); //Create a LinkedHashSet to maintain the insertion order
        StringBuilder output = new StringBuilder(); //Create a string builder to store unique string

        for (char ch : input.toCharArray()) { //convert String to charArray
            if (!uniqueSet.contains(ch)) {
                uniqueSet.add((ch));
                output.append(ch);
            }
        }
        return output.toString();
    }
}
