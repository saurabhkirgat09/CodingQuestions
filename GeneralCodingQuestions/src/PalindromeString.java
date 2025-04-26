public class PalindromeString {

    public static boolean isPalindrome (String input) {
        int left = 0;
        int right = input.length() -1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }

    public static boolean isPalindromeWay2( String input) {
        String original = input;
        StringBuilder result = new StringBuilder();
        for (int i = input.length() - 1; i>0; i--) {
            result.append(input.charAt(i));
        }
        return original.equals(result.toString());
    }

    public static void main(String[] args) {
        if (isPalindrome("abcddcba")) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }

        if (isPalindromeWay2("sheywsndhe")) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }
}
