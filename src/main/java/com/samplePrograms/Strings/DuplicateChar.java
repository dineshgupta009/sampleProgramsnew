package com.samplePrograms.Strings;

public class DuplicateChar {

    public static void main(String[] args) {


        String str = "great responsibility";
        int count;
        char[] string = str.toCharArray();
        System.out.println("duplicate characters");

        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    string[j] = '0';
                }
            }
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }

        String str1 = "Big black bug bit a big black dog on his big black nose";
        int count1;
        String[] string1 = str1.split(" ");

        System.out.println("duplicate words");

        for (int i = 0; i < string1.length; i++) {
//            System.out.println(string1[i]);
            count1 = 1;
            for (int j = i + 1; j < string1.length; j++) {
                if (string1[i].equals(string1[j]) ) {
                    count1++;
                    string1[j] = "0";
                }
            }
            if (count1 > 1 && string1[i] != "0")
                System.out.println(string1[i]);
        }
    }
}