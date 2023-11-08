package com.samplePrograms.BasicProgram;

public class Practice2 {

    //    Palindrome Program in Java

    public static void check(int num){
        String s=String.valueOf(num);

        String rev = null;
        for (int i=s.length()-1;i>=0;i--){
             rev = String.valueOf(s.charAt(i));
        }
        if(s.equals(rev)){
            System.out.println("its  a palindrome");
        }else System.out.println("not palindrome");

    }
    public static void main(String[] args) {

        check(12321);
    }
}
