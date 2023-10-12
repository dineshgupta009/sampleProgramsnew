package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Program2 {

    public static void main(String[] args) {

        String str="we are here to help help here we ";

        Map<String,Integer> map= new HashMap<>();
        String words[]=str.split(" ");
        for (String word: words){
            Integer inte=map.get(word);
            if (inte==null){
                map.put(word,1);
            }else {
                map.put(word,inte+1);
            }
        }
        System.out.println(map);
    }
}
