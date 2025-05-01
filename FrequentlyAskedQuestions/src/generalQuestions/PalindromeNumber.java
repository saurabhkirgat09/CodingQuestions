package generalQuestions;

public class PalindromeNumber {

    public static int isPalindrome (int number) {
        int reversed = 0;
        while (number > 0) { //1221
            int mod = number%10;  //
             reversed = reversed*10 + mod;
             number = number/10;
        }
        //if (number == reversed) return true;
        return reversed;
    }

    public static int calculateFactorial(int number) {
        int factorial =1;
        if (number ==0) return 1;
        for(int i=number; i<= 1; i--) {
            factorial = factorial*number;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("REVERSED NUMBER: "+ isPalindrome(1221));
    }
}
