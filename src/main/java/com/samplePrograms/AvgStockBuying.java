package com.samplePrograms;

import java.util.Scanner;
import java.util.SortedMap;

public class AvgStockBuying {

    public int iAmt;
    public int stkPrice;
    public int ttlBuyQut;

    public void Case1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Amount to invest :  ");
        iAmt = sc.nextInt();
        System.out.print("Enter Stock Price  :  ");
        stkPrice = sc.nextInt();
        ttlBuyQut = Math.round(iAmt / stkPrice);
        System.out.println(ttlBuyQut * stkPrice);
        System.out.println(ttlBuyQut);
    }

    public static void Case2() {

        AvgStockBuying b = new AvgStockBuying();
        b.Case1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Second Stock Buying Price : ");
        int rudPrice = sc.nextInt();
        System.out.print(rudPrice);


    }


    public static String Case3() {
        return "this is case3 method";
    }

    public static void main(String[] args) {
        AvgStockBuying avgStockBuying = new AvgStockBuying();

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Buying  :  ");
        int nBuying = sc.nextInt();


        switch (nBuying) {
            case 1: {

                avgStockBuying.Case1();
            }
            break;
            case 2: {
                AvgStockBuying.Case2();
                break;
            }
            case 3: {
                AvgStockBuying.Case3();
                break;
            }
            default:
                System.out.println("Enter No Of Buying not more than 3");
        }
    }
}
