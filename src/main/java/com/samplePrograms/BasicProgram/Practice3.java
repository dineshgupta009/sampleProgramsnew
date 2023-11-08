package com.samplePrograms.BasicProgram;

import java.util.Scanner;

public class Practice3 {
//     Program ATM teller Machine program
    public static void main(String[] args) {


        int balance = 10000, withdraw,deposit;

        Scanner sc = new Scanner(System.in);
        while (true){

            System.out.println("Automatic teller machine");
            System.out.println("Choose 1 to deposit");
            System.out.println("Choose 2 to Withdraw");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to Exit");
            System.out.print("Choose the operation you want to perform:");

            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Enter Amount to deposit : ");
                    deposit = sc.nextInt();
                    balance= balance+deposit;
                    System.out.println("Amount deposited successfully Available Balance : "+balance);
                    break;

                case 2:

                    System.out.print("Enter Amount to withdraw: ");
                    withdraw=sc.nextInt();
                    if (withdraw>balance){
                        System.out.println("Insufficient Balance");
                    }else {
                        balance = balance-withdraw;
                        System.out.println("Available Amount After withdrawal: " +balance);
                        System.out.println("Please collect Money");
                    }
                    break;
                case 3:
                    System.out.println("Available Balance :  " +balance);
                    break;
                case  4:
                    System.exit(0);
            }
        }

    }
}
