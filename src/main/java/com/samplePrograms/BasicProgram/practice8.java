package com.samplePrograms.BasicProgram;

import java.util.Scanner;

public class practice8 {

    public static void main(String[] args) {

        int [] number = new int[]{1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be greater than sum of two number ");
        int enter = sc.nextInt();
        for (int i=0;i<=number.length-1;i++){
            for (int j=1;j<=number.length-1;j++){
                if((i+j)>=enter){
                    System.out.println(i+" + "+j+" = "+ (i+j) );
                }
            }
        }

        sc.close();

    }
}
