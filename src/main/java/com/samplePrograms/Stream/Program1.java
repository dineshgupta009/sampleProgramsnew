package com.samplePrograms.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program1 {
//          Double the numbers of an ArrayList using Java 8 Streams
    public static void main(String[] args) {

        List<Integer> doubleInt= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       List<Integer> d= doubleInt.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(d);

    }
}
