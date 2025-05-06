package org.example;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindSumOfEvenAndOddNumbers {

    public static Map<Boolean, Integer> getSumOfEvenAndOdd(List<Integer> numList) {
        return numList.stream()
                .collect(
                        Collectors.partitioningBy(n -> n % 2 == 0, Collectors.summingInt(Integer::intValue)
                ));
    }
    public static void main(String[] args) {
        System.out.println(getSumOfEvenAndOdd(Arrays.asList(2,4,5,3,6,8,7,9)));
    }
}
