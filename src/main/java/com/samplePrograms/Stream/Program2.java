package com.samplePrograms.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;


public class Program2 {

    //    Double the even/odd numbers ArrayList using Java 8 Streams
    public static void main(String[] args) {

        List<Integer> doubleEven = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        AtomicReference<List<Integer>> evenNumbers = new AtomicReference<>(doubleEven.stream().filter(i -> i % 2 == 0).map(d -> d * 2).collect(Collectors.toList()));

        Map<Boolean, List<Integer>> evenNumbers1 = doubleEven.stream()
//                .filter(i -> i % 2 == 0).map(d -> d * 2)
                .collect(Collectors.partitioningBy(i->i%2 == 0));
        System.out.println(evenNumbers1);
        System.out.println(evenNumbers1.get(false));
        System.out.println(evenNumbers1.get(Boolean.TRUE));
    }
}
