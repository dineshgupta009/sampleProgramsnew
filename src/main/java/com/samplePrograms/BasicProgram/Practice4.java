package com.samplePrograms.BasicProgram;

public class Practice4 {

    public static void main(String[] args) {

        int number =546656, reverse=0;
        while (number!=0){
            int remainder = number%10;
            reverse = reverse*10+remainder;
            number = number/10;
        }
        System.out.println("The reverse of given number is : " + reverse);
    }
}
