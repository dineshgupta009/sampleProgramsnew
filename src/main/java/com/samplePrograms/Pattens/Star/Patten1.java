package com.samplePrograms.Pattens.Star;



public class Patten1 {
    //  Right Triangle Star Pattern
/*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * * * *


            * * * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
 */
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println();
        for (int i=0;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
