package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOcc {

    //    How to find the maximum occurring character in a given String?
    public static void givenString(String str) {

        Map<Character,Integer> charCount = new HashMap<>();
       String word = str.replaceAll(" ", "");
        System.out.println(word);
        for(int i=0;i<word.length();i++){
            if (charCount.containsKey(word.charAt(i))){
                charCount.put(word.charAt(i),word.charAt(i)+1);
                 }else {
                charCount.put(word.charAt(i),1);
            }
        }
        System.out.println(charCount);
    }

    public static void main(String[] args) {
        givenString("we are here to help you");
    }

}
