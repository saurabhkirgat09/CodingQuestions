package strings;

public class DecompressionString {

    public static String getDecompressedString(String input) {
        StringBuilder result = new StringBuilder();

        for (int i=0; i<=input.length()-1; i+=2) {
            int count = input.charAt(i+1) - '0';

            for (int j = 0; j<count; j++) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {

        String input = "w4a3d1e1x6";
        System.out.println("The decompressed string is: " + getDecompressedString(input));
    }
}
