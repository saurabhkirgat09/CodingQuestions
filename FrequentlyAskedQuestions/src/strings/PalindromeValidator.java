package strings;

import java.util.HashMap;
import java.util.Map;

public class PalindromeValidator {


    public static boolean isPalindrome(String input) {

        int left = 0;
        int right = input.length() -1;
        while (left < right) {
           if (input.charAt(left) != input.charAt(right)) {
               return false;
            }

           left++;
           right--;
        }
        return true;
    }

    public static boolean findPalindromePossibility(String input) {
        Map<Character, Integer> countOccurrence = new HashMap<>();
        for (int i=0; i<input.length(); i++) {
            countOccurrence.put(input.charAt(i), countOccurrence.getOrDefault(input.charAt(i), 0) +1);
        }
        int oddOccurrence = 0;
        for(int freq : countOccurrence.values()) {
            if (freq %2 !=0){
                oddOccurrence++;
            }
        }
        return oddOccurrence<=1;
    }



    public static void main(String[] args) {
        String input1 = "abdddcba";

        if (isPalindrome(input1)) {
            System.out.println("String is palindrome");
        } else if (findPalindromePossibility(input1)) {
            System.out.println("String can be Palindrome");
        }
    }
}
