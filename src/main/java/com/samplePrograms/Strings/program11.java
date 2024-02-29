package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class program11 {

    public static void printMaxOccurringChar(String str){

        char [] chars= str.replaceAll(" ", "").toCharArray();
        Map<Character,Integer>  charCount = new HashMap<>();

        for (char c: chars){
            if (charCount.containsKey(c)){
                charCount.put(c, charCount.get(c)+1);
            }else {
                charCount.put(c,1);
            }
        }
        System.out.println(charCount);

        Set<Map.Entry<Character,Integer>>  count= charCount.entrySet();
        int maxCount =0 ;
        char maxChar= 0;
        for (Map.Entry<Character,Integer> d: count){
            if (d.getValue() > maxCount){
                maxCount = d.getValue();
                maxChar = d.getKey();
            }
        }

        System.out.println("Input String : "+str);

        System.out.println("Maximum Occurring char and its count :");

        System.out.println(maxChar+" : "+maxCount);
    }
    public static void main(String[] args) {
        printMaxOccurringChar("Java Concept Of The Day");

        System.out.println("========================");

        printMaxOccurringChar("Java J2ee Android Hibernate JSP");

        System.out.println("========================");

        printMaxOccurringChar("abbcccddddeeeeeffffff");

        System.out.println("=========================");

        printMaxOccurringChar("122333444455555666666");
    }
}
