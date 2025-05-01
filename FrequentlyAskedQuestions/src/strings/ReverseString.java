package strings;

public class ReverseString {

    public static void main(String[] args) {

        String result = getReversed("a b c dfs ef k");
        //String result2 = getReversedPreservingSpaces("a b c dfs ef k");
        System.out.println("Reversed strings is: " + result);
        //System.out.println("Reversed strings is: " + result2);
    }

    public static String getReversed(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() -1; i>=0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();

    }
}
