package com.samplePrograms.Strings;

import java.util.Locale;

public class Program6 {


    /// Java Program to count the total number of vowels and consonants in a string
    public static void main(String[] args) {
        int vovCount = 0, conCount = 0;
        String str1 = "we are here to help you ";
        String str = str1.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
                    vovCount++;
            }else {
                conCount++;
            }

        }
        System.out.println("Vowel : " +vovCount);
        System.out.println("consonants : " +conCount);
    }
}
