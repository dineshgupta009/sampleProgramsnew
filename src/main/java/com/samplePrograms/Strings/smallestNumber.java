package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class smallestNumber {
    public static void main(String[] args) {

        String str = "we are here to help";
        Map<String, Integer> integerMap = new HashMap<>();
        String words[] = str.split(" ");
        for (String word : words) {
            if (integerMap.containsKey(word)) {
                integerMap.put(word.toLowerCase(), integerMap.get(word) + 1);
            }else {
                integerMap.put(word.toLowerCase(),1);
            }
        }

        System.out.println(integerMap);
    }
}
