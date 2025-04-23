package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharactersInString {

    public static void main(String[] args) {

        for (Map.Entry<Character, Long> result :findRepeatingCharactersWithMap("programming").entrySet()) {
            if (result.getValue() > 1) {
                System.out.println("Character: " + result.getKey() + " Occurrence: " +result.getValue() + " times");
            }
        }
    }


    private static Map<Character, Long> findRepeatingCharactersWithMap(String input){
        Map<Character, Long> result = new HashMap<>();
        for (char ch : input.toCharArray()) {
            result.put(ch, result.getOrDefault(ch, 0L) + 1);
        }
        return result;
    }

    private static void findRepeatingCharacters(String input) {
        Map<Character, Long> result =  input.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.toMap(
                                c -> c,
                                v -> 1L,
                                (a,b) -> a+b

                        )
                );
        result.entrySet()
                .stream()
                .filter(c -> c.getValue() > 1L)
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue() + " times")
                );

    }
}
