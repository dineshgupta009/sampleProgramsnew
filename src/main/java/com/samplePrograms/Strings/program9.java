package com.samplePrograms.Strings;

public class program9 {

    //    How to reverse a string in Java?
    public static void main(String[] args) {

        String str = "we are here to help you";
        StringBuffer sbf = new StringBuffer(str);
        System.out.println(sbf.reverse());

        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    };

}
