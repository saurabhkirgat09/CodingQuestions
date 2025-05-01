package strings;

public class CountVowelsConsonantAndCompressString {

    //Program to count vowels and consonant in string
    public static void countVowelsAndConsonent(String input) {
        int vowels = 0, consonent = 0;
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u') {
                    vowels++;
                } else {
                    consonent++;
                }
            }
        }

        System.out.println("The count of vowels is: " + vowels);
    }

    //Compress String
    public static String compressString(String input) { //input = aabbccd;

        if (input ==null || input.isEmpty()) {
            return "";
        }
        int counter =1;
        StringBuilder result = new StringBuilder();
        for (int i=1; i<input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i-1)) {
                counter++;
            } else {
                result.append(input.charAt(i-1)).append(counter);
                counter = 1;
            }
        }
        result.append(input.charAt(input.length()-1)).append(counter);
        return result.toString();
    }


    public static void main(String[] args) {

    }
}
