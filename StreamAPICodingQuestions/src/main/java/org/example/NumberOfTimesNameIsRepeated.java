package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberOfTimesNameIsRepeated {

    public static Map<String, Long> getRepetition(String input) {
        String [] arr = input.split(",\\s*");
        return Arrays.stream(arr)
                .collect(
                        Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()));
    }
    public static void main(String[] args) {
        Map<String, Long> response = getRepetition("Saurabh, Kirgat, Mahadev, Saurabh, Mahadev, is, Kirgat");
        for(Map.Entry<String, Long> str : response.entrySet()) {
            System.out.println("The Repetition count for the word: " + str.getKey() + " is: "+ str.getValue());
        }
    }


}
