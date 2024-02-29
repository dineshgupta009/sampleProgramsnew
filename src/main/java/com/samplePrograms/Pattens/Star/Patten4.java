package com.samplePrograms.Pattens.Star;

public class Patten4 {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");// when we change no of space we would get Different pattens
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k+ " ");// when we change no of space we would get Different pattens
            }
            System.out.println();
        }
    }
}
