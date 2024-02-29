package com.samplePrograms.Strings;

import java.util.HashMap;
import java.util.Map;

public class program10 {


    //    Java Program To Find Duplicate Characters In A String ?
    public static void main(String[] args) {

        String str = "we are here to help you ";
        Map<Character, Integer> containsCount = new HashMap<>();

        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if (containsCount.containsKey(c)) {

                containsCount.put(c,containsCount.get(c)+1);
            }else {
                containsCount.put(c,1);
            }
        }
        System.out.println(containsCount);
    }
}
