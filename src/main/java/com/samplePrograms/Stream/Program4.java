package com.samplePrograms.Stream;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class Program4 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(15, 12, 45, 2, 565, 1, 18, 5, 6);

        list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);
    }
}
