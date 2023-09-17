package com.rfp.ATMMachineProject;

import java.util.Scanner;

class ATM {
    float balance;
    int pin = 6386;

    public void checkPin() {
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int inputPIN = sc.nextInt();
        if (inputPIN == pin) {
            menu();
        } else {

            System.out.println("Enter valid pin:");
            menu();
        }

    }

    public void menu() {
        System.out.println("Enter your choice:");
        System.out.println("1. Check Account balance");
        System.out.println("2. Withdraw money:");
        System.out.println("3. Deposit money:");
        System.out.println("4.Exit");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            widrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter valid choice..");
        }
    }

    public void checkBalance() {
        System.out.println("Balance : " + balance);
        menu();
    }

    public void widrawMoney() {
        System.out.println("Enter amount to withdrawMoney:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw money successfully");

        }
        menu();
    }

    public void depositMoney() {
        System.out.println("Enter the amount:");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposited successfully ");
        menu();
    }
}

public class AtmMachine {
    public static void main(String[] args) {
        ATM ref = new ATM();
        ref.checkPin();
    }
}
