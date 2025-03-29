package org.example;

import java.util.List;
import java.util.Optional;

public class FindSumOfAllIntegers {

    public static void main(String[] args) {
        List<Integer> numList = List.of(2,3,43,54,34,7,65,44,35,75,54,65,54,78,97);
        Optional<Integer> result =  getSumOfNumbers(numList);
        double average = getAverage(numList);
        result.ifPresent(value -> System.out.println("Sum of All Integers in list is: " + value));
        System.out.println("Average of Given list is: " +average);
    }

    //Logic to get Sum of Numbers
    private static Optional<Integer> getSumOfNumbers(List<Integer> numList) {
       return numList.stream()
                .reduce(Integer::sum);
    }

    //Logic to get print average
    private static double getAverage(List<Integer> numList) {
        return numList.stream()
                .mapToInt(e-> e)
                .average()
                .orElse(0.0);
    }


}
