package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class countDuplicate {

    public static void countWords(String str) {

        String Words[] = str.split(" ");

        Map<String, Integer> countWords = new HashMap<>();
        for (String word : Words) {
            if (countWords.containsKey(word)) {
                countWords.put(word.toLowerCase(), countWords.get(word)+1);
            } else {
                countWords.put(word.toLowerCase(), 1);
            }
        }
        System.out.println(countWords);
    }

    public static void main(String[] args) {
        countWords("we are we are here are we ");
    }
}
