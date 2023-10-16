package com.samplePrograms.Strings;

public class permutation {

    public static void generatePermutations1(String input, String ans ){

        if (input.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<input.length();i++){
            char ch = input.charAt(i);
            String remaining= input.substring(0,i)+input.substring(i+1);
            generatePermutations1(remaining,ans+ch);
        }
    }
    public static void main(String[] args) {

        String input = "abc";
        generatePermutations1(input, "");
        System.out.println("All permutations of " + input + " have been displayed.");
    }
}
