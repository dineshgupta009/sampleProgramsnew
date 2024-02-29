package com.samplePrograms.Pattens.numbers;

public class pat8 {
/*
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
  1 2 3 4 5 6
1 2 3 4 5 6 7
*/

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print(i +" ");
            }

            System.out.println();
        }

    }

}

