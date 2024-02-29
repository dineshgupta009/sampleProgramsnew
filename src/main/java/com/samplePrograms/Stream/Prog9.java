package com.samplePrograms.Stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Prog9 {

    public static void main(String[] args) {

        String str = "we are here we are are here " ;

        String [] words = str.split(" ");

        Map<String,Integer> wordCount = new HashMap<>();
        for (String word:words){
            if (wordCount.containsKey(word)) {

                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else
                wordCount.put(word.toLowerCase(),1);
        }
        System.out.println(wordCount);

        System.out.println(IntStream.range(0, 5).sum());
    }


}
