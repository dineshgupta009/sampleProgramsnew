package com.samplePrograms.BasicProgram;

public class Practice7 {

    public static void oddNumberAndEvenNumber(int n){
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i +" ");
            }
//            else {
//                System.out.println(i);
//            }
        }

    }
      public static void main(String[] args) {
        oddNumberAndEvenNumber(50);

    }
}
