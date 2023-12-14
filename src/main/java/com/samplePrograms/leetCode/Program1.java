package com.samplePrograms.leetCode;

import java.util.Arrays;

public class Program1 {

    public static void twoSum(int[] num, int target) {
        int n = num.length;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] + num[j] == target) {
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }
        System.out.println(Arrays.toString(new int[]{,}));
    }

    public static void main(String[] args) {


        twoSum(new int[]{1, 5, 3, 8, 7}, 20);

    }
}
