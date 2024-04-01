package com.exampleoops.demoATM;

import java.util.Scanner;

public class AtmApplication {
    int balance;
    int PIN = 5665;
    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();
        if(enterpin == PIN){
            menu();
        }else{
            System.out.println("Enter the correct pin");
            menu();
        }

    }
    public void menu(){
        System.out.println("Enter Your choice");
        System.out.println("1. Total Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3 Deposit Amount");
        System.out.println("4 Exit");
        Scanner sc = new Scanner(System.in);
        int opt  = sc.nextInt();

        if(opt == 1){
            displayAmount();
        } else if (opt == 2) {
            amountWithdraw();

        } else if (opt == 3) {
            amountDeposit();
        }else if(opt == 4){
            System.out.println("Invalid Input");

        }else{
            System.out.println("Ender a valid choice");
        }

    }
    void displayAmount(){
        System.out.println("The Acount balanc is" + balance);
        menu();
    }

    void amountWithdraw(){
        System.out.println("Enter the amount that needs to be withdrawn");
        Scanner sc = new Scanner(System.in);
        int amount  = sc.nextInt();
        if(amount > balance){
            System.out.println("Invalid amount greater then the Balance");
        }else{
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        }
        System.out.println("Total Amount "+ balance);
        menu();
    }
    public void amountDeposit(){
        System.out.println("Enter the amount to be deposit");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance + amount;
        menu();
    }

    public static void main(String[] args) {
        AtmApplication atmApplication = new AtmApplication();
        atmApplication.checkpin();

    }
}
