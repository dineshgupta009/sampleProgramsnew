package com.samplePrograms.Strings;

import java.util.List;

public class Program1 {

    public static void reverseString(String str){

       String words[]=str.split(" ");
       String reverseString = "";
       for (int i=0;i<= words.length-1;i++){
           String word = words[i];
           String reverseWord="";
           for (int j= word.length()-1;j>=0;j--){
               reverseWord = reverseWord+word.charAt(j);
           }
           reverseString= reverseString + reverseWord +" ";

       }

        System.out.println(reverseString);
    }
    public static void main(String[] args) {

        reverseString("we are here to help you");
    }
}
