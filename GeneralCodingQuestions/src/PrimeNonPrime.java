import java.util.Arrays;
import java.util.List;

public class PrimeNonPrime {

    public static Boolean isPrime(Integer num) {

        if (num <=1) {
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num %2==0){
            return false;
        }
        int sqrt = (int)Math.sqrt(num);
        for(int i=3; i<=sqrt;i=i+2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(0,1,23,22,34,53,2,5,64,3,9,41,24,99);

        List<Integer> primeNumbers = listOfIntegers.stream()
                .filter(PrimeNonPrime::isPrime)
                .toList();

        System.out.println("List of Prime Numbers" + primeNumbers);
    }
}
