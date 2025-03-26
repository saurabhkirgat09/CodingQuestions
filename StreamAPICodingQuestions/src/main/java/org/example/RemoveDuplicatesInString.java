package org.example;

import java.util.stream.Collectors;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String input = "bcdedbsfesd";
        System.out.println(" String after removing duplicates: " + removeDuplicateChars(input));
    }

    private static String removeDuplicateChars(String input) {
        return input.chars() //provides InputStream
                .distinct()  // Apply distinct to remove duplicates
                .mapToObj(c-> String.valueOf((char) c)) //convert ascii codes into char first then String
                .collect(Collectors.joining()); //Join all the characters to Complete String
    }


}
