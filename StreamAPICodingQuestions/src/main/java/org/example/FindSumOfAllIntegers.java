package org.example;

import java.util.List;
import java.util.Optional;

public class FindSumOfAllIntegers {

    public static void main(String[] args) {
        List<Integer> numList = List.of(2,3,43,54,34,7,65,44,35,75,54,65,54,78,97);
        Optional<Integer> result =  getSumOfNumbers(numList);
        result.ifPresent(value -> System.out.println("Sum of All Integers in list is: " + value));
    }

    private static Optional<Integer> getSumOfNumbers(List<Integer> numList) {
       return numList.stream()
                .reduce(Integer::sum);
    }
}
