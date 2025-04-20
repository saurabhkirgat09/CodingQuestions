package org.example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindSumOfAllIntegers {

    public static void main(String[] args) {
        List<Integer> numList = List.of(2,3,43,54,34,7,65,44,35,75,54,65,54,78,97);
        int result =  getSumOfNumbers(numList);
        System.out.println("Sum of All Integers in list is: " + result);

        double average = getAverage(numList);
        System.out.println("Average of Given list is: " +average);

        double averageOfSquareAndFilter = findSquareFilterAndAverage(numList);
        System.out.println("The Average of List with Numbers having Square value more than 100: " +
                averageOfSquareAndFilter);
    }

    //Logic to get Sum of Numbers
    private static int getSumOfNumbers(List<Integer> numList) {
       return numList.stream()
                .reduce(0, Integer::sum);
    }

    private static int getSumOfNumbersWithMapping(List<Integer> numList) {
        return numList.stream()
                .collect(Collectors.summingInt(Integer::intValue));
    }

    //Logic 2 to get the sum of numbers
    private static int addAllNumbers(List<Integer> numList) {
        int sum = 0;
        for (int num: numList) {
            sum = sum + num;
        }
        return sum;
    }



    //Logic to get print average
    private static double getAverage(List<Integer> numList) {
        return numList.stream()
                .mapToInt(e-> e)
                .average()
                .orElse(0.0);
    }

    //Find the square of Numbers and filter the numbers greater than 100 and the find the average of List
    private static double findSquareFilterAndAverage (List<Integer> numList) {
        return numList.stream()
                .map(n-> n*n)
                .filter(n-> n>100)
                .mapToInt(e->e)
                .average()
                .orElse(0.0);

    }


}
