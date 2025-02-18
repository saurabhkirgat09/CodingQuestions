import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSeriesWithRecursion {

    static Map<Integer,Integer> cachedMap = new HashMap<>();

    public static int getFibonacci(int num) {
        if(num == 0) {return 0;}
        if (num == 1){return 1;}
        if(cachedMap.containsKey(num)) {
            return cachedMap.get(num);
        }
        int result =  getFibonacci(num -1) + getFibonacci(num -2);
        cachedMap.put(num,result);
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number to print fibonacci series");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Fibonacci Series:");
            for (int i=0; i<=num; i++) {
                System.out.print(getFibonacci(i) + " ");
            }
        } catch (Exception e) {
            System.out.println("Error while calculating fibonacci");
        }

    }
}
