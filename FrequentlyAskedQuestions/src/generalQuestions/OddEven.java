package generalQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEven {

    public static void oddOrEven(int num) {
        if (num == 0) {
            System.out.println("Given number is neither odd nor even.");
            return;
        }
        if (num % 2 == 0) {
            System.out.println("Given number " + num + " is an Even number.");
        } else {
            System.out.println("Given number " + num + " is an Odd number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Number to check if it's Odd or Even:");

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(bufferedReader.readLine());
            oddOrEven(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
