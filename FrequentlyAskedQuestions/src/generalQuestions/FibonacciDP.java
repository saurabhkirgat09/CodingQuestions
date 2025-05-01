package generalQuestions;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FibonacciDP {

    public static void fibonacciSeries(int num) {

        int first = 0;
        int second = 1;
        System.out.println("Fibonacci series for num " +num + " is");
        for(int i=0; i<=num; i++){
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
    public static void main(String[] args) {
        //Dry Run
        // 0 -> 0 -> next = 1 -> first=1 -> second=1
        // 1-> 0,1 -> next= 2 -> first=1 -> second=2
        // 2-> 0,1,1 -> next=3 -> first=2 -> second=3
        try {
            System.out.println("Enter a number to find fibonacci series for");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int fibonacciNum  = Integer.parseInt(bufferedReader.readLine());
            fibonacciSeries(fibonacciNum);
        } catch (Exception e) {
            System.out.println("Exception occurred while reading input" + e);
        }
    }
}
