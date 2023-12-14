package com.samplePrograms.leetCode;

public class Program2 {

  public static void reve(int num){
      if(num>=0){
          String i=String.valueOf(num);
          for (int j=i.length()-1;j>=0;j--){
              System.out.print(i.charAt(j));
          }
          System.out.println();
      }else {
          String i=String.valueOf(num);
          System.out.print("-");
          for (int j=i.length()-1;j>=1;j--){

              System.out.print(i.charAt(j));
          }
          System.out.println();
      }
  }
    public static void main(String[] args) {

           reve(123345);
           reve(-12456);
        reve(0);

    }
}
