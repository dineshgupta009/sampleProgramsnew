package com.samplePrograms.Strings;

public class Program7 {

    public static void main(String[] args) {

       String str = "we are on the top";
       String reverseString="";
       String [] words = str.split(" ");
       for (int i=0;i< words.length;i++){
           String reverseWord = "";
           String word= words[i];
           for (int j= word.length()-1;j>=0;j--){
               reverseWord = reverseWord+word.charAt(j);
           }
            reverseString = reverseString +reverseWord +" ";
       }

        System.out.println(reverseString);
    }
}
