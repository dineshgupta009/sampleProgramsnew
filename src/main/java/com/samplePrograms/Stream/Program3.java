package com.samplePrograms.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class Program3 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(15, 12, 45, 2, 565, 1, 18, 5, 6);
        list.stream().filter(o -> o % 2 == 0).forEach(System.out::println);

        // find remaining data also using collections.partitionBY
        Map<Boolean, List<Integer>> listMap = list.stream()
//                .filter(o -> o % 2 == 0)
                .collect(Collectors.partitioningBy(o -> o % 2 == 0));

        System.out.println("Odd Numbers " +listMap.get(false));
        System.out.println("Even Numbers " +listMap.get(true));

    }
}
