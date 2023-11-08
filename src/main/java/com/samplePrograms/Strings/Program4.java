package com.samplePrograms.Strings;

public class Program4 {

    public static void inputString(String str) {

        String words[] = str.split(" ");
        String reverseString = "";
        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i) ;
            }
            reverseString = reverseString + reverseWord +" ";
        }

        System.out.println(reverseString);
    }

    public static void main(String[] args) {

        inputString("we are here to help you");
    }
}
