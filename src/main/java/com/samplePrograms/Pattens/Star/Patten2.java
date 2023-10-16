package com.samplePrograms.Pattens.Star;

import java.util.Scanner;

public class Patten2 {
/*
                               *
                             * *
                           * * *
                         * * * *
                       * * * * *
                     * * * * * *

  */
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("  ");// when we change no of space we would get Different pattens
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");// when we change no of space we would get Different pattens
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");// when we change no of space we would get Different pattens
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");// when we change no of space we would get Different pattens
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("");// when we change no of space we would get Different pattens
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" *");// when we change no of space we would get Different pattens
            }
            System.out.println();
        }

    }
}
