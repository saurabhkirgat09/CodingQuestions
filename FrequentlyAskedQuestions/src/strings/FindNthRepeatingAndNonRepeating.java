package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindNthRepeatingAndNonRepeating {

    public static Map<Character, Integer> getMapOfCharacterOccurrence(String input) {
        Map<Character, Integer> mapCount = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            mapCount.put(ch, mapCount.getOrDefault(ch, 0) + 1);
        }
        return mapCount;
    }

    // Using Streams Nth Repeating
    public static Character getNthNonRepeatingChar(String input, int n) {
        return getMapOfCharacterOccurrence(input)
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .skip(n - 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null); // return null if not found
    }

    // Using Streams Nth NonRepeating
    public static Character getNthRepeatingChar(String input, int n) {
        return getMapOfCharacterOccurrence(input)
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .skip(n - 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null); // return null if not found
    }

    // Without Using Streams Nth NonRepeating
    public static Character getNthNonRepeatingCharWithoutStreams(String input, int n) {
        Map<Character, Integer> countMap = getMapOfCharacterOccurrence(input);
        int count = 0;

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == n) {
                    return entry.getKey();
                }
            }
        }
        return null; // not found
    }
    // Without using Streams Nth Repeating
    public static Character getNthRepeatingCharWithoutStreams(String input, int n) {
        Map<Character, Integer> countMap = getMapOfCharacterOccurrence(input);
        int count = 0;

        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
                if (count == n) {
                    return entry.getKey();
                }
            }
        }
        return null; // not found
    }

    public static void main(String[] args) {
        String input = "aaabbcdd";

        Character secondNonRepeating = getNthNonRepeatingChar(input, 2); // e.g., second non-repeating
        Character firstRepeating = getNthRepeatingChar(input, 1); // e.g., first repeating

        Character secondNonRepeatingWithOutStreams = getNthNonRepeatingChar(input, 2); // e.g., second non-repeating
        Character firstRepeatingWithOutStreams = getNthRepeatingChar(input, 1); // e.g., first repeating

        System.out.println("Second Non-Repeating Character: " + secondNonRepeating);
        System.out.println("First Repeating Character: " + firstRepeating);

        System.out.println("Second Non-Repeating Character: " + secondNonRepeatingWithOutStreams);
        System.out.println("First Repeating Character: " + firstRepeatingWithOutStreams);
    }
}
