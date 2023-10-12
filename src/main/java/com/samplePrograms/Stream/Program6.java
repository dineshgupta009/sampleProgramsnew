package com.samplePrograms.Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Program6 {

    public static void main(String[] args) {
//        Given the list of integers, find the first element and count total number of the list using Stream functions?

        List<Integer> integerList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        System.out.print("First Element Of Array List : ");
        integerList.stream().findFirst().ifPresent(System.out::println);

       long count = (integerList.stream().count());
        System.out.println("Total number of elements : " + count);
    }
}
