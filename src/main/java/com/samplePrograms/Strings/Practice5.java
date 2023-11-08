package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class Practice5 {

    public static void countString(String str){

        String words[]= str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word: words){
            if (wordCount.containsKey(word)) {

                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else {
                wordCount.put(word.toLowerCase(),1);
            }
        }
        System.out.println(wordCount);
    }
    public static void main(String[] args) {

        countString("we we are are here to to help we are we you");
    }
}
