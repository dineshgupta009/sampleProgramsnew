package com.samplePrograms.Strings;

public class Program8 {
    public static void main(String[] args) {

//        count number of characters

        String str = "we are on the top";
        int count =0;
        for (int i=0;i<str.length();i++)
            if(str.charAt(i) != ' '){
                 count ++;
            }
        System.out.println(count);
    }
}
