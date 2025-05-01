package generalQuestions;

public class FactorialOfNumber {

    public static int calculateFactorial(int number) {
        int factorial =1;
        if (number ==0) return 1;
        for(int i=number; i<= 1; i--) {
            factorial = factorial*number;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("factorial of number: " + num + calculateFactorial(num));
    }
}
