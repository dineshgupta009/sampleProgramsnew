package com.samplePrograms.Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Program8 {

    public static void main(String[] args) {


        Integer numbers[] = {1, 2, 3, 4, 5};
        String[] list = {"HP", "Lenovo", "Dell", "Macbook", "Acer"};

        Integer resultOne = Stream.of(numbers)
                .reduce(100, (x, y) -> x + y);
        System.out.println(resultOne);

        Integer resultTwo = Arrays.stream(numbers)
                .reduce(100, Integer::max);
        System.out.println(resultTwo);

        String resultThree = Stream.of(list)
                .reduce("Programming languages:", (x, y) -> x + " | " + y);
        System.out.println(resultThree);


    }
}
