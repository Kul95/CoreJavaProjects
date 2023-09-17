package com.rfp.MiniProject1;

import java.util.Scanner;

public class Main {
    EmployeeServices services=new EmployeeServices();
    static boolean ordering=true;
    public static void menu(){
        System.out.println("<---------------------------Welcome to Employee Management System----------------->" +
                " " +" \n1 - Add Employee"+
                "" +" \n2 - View Employee "+
                "" +" \n3 - Update Employee Details"+
                "" +" \n4 - Delete Employee Detail "+
                "" +"\n5 - View All  Employee Details "+
                "" +" \n6 - Exit ");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        EmployeeServices service=new EmployeeServices();


        do {
            menu();
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Add employee");
                    break;
                case 2:
                    System.out.println("View Employee");
                    break;
                case 3:
                    System.out.println("Update Employee Details");
                    break;
                case 4:
                    System.out.println("Delete Employee Detail");
                    break;
                case 5:
                    System.out.println("View All  Employee Details");
                    service.viewAllEmployee();
                    break;
                case 6:
                    System.out.println("Thank you for using application");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid information.");
                    break;

            }

        }while (ordering);
    }
}
