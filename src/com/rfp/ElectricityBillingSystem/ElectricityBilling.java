package com.rfp.ElectricityBillingSystem;

import java.util.Scanner;

public class ElectricityBilling {
    public static void main1(){
        double amount=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the consumer name: ");
        String ConsumerName=sc.nextLine();
        System.out.println("Enter the consumer number: ");
        long consumerNumber=sc.nextLong();
        System.out.println("Enter the number of units consumed: ");
        int units=sc.nextInt();
        if(units<=100){
            amount=units*5.50;
        } else if (units>100 && units<300) {
            amount=100*5.50+(units-100)*6.50;
        } else if (units>300 && units<600) {
            amount=100*5.5+200*6.50+(units-300)*7.50;
        } else if (units>600) {
            amount = 100 * 5.5 + 200 * 6.50 + 300 * 7.50 + (units - 600) * 8.50;
        }
            System.out.println("Consumer name: "+ConsumerName);
            System.out.println("Consumer number: "+consumerNumber);
            System.out.println("Number of consumed: "+units);
            System.out.println("Consumer Amount paid: "+amount);

        }
    public static void main(String[] args) {
        main1();
    }
}
