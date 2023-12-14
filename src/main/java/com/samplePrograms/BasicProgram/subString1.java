package com.samplePrograms.BasicProgram;

public class subString1 {

    public static void main(String[] args) {

      String str[] = {"dinesh gupta", "arun gupta", "ram gupta", "anil singh", "veer verma","Arjun singh"};
      String surname="gupta";
      int strLength= str.length;
      int surNameSize = surname.length();
      for (int j=0;j<strLength;j++){
          int length = str[j].length();
          String subString = str[j].substring(length-surNameSize);
          if (subString.equals(surname)){
              System.out.println(str[j]);
          }
      }
    }
}
