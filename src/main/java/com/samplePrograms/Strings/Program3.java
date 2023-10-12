package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
    public static void main(String[] args) {
        String str= "we are here to help help here we ";
        Map<String,Integer> wordCount = new HashMap<>();
        String words[]=str.split(" ");
        for (String word:words){
            if (wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }else {
                wordCount.put(word.toLowerCase(),1);
            }
        }
        System.out.println(wordCount);
    }
}
