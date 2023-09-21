package com.rfp.EmployeeManagementSystem;

import java.util.Scanner;

public class Main {
    EmployeeService service=new EmployeeService();
    static boolean ordering=true;
    public static void menu(){
        System.out.println("*********Welcome to employee Management System*****"
        +"\n1. Add Employee "
        +"\n2. View Employee"
        +"\n3.Update Employee"
        +"\n4. Delete Employee"
        +"\n5. View All Employee"
        +"\n6. Exit ");

    }

    public static void main(String[] args) {
        EmployeeService service1=new EmployeeService();
        Scanner sc=new Scanner(System.in);

        do{
            menu();
            System.out.println("Enter the choice! :");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Add Employee: ");
                    service1.insertEmployee();
                    break;
                case 2:
                    System.out.println(" View Employee: ");
                    service1.viewEmployee();
                    break;
                case 3:
                    System.out.println("Update Employee: ");
                    service1.updateEmployee();
                    break;
                case 4:
                    System.out.println("Delete Employee: ");
                    service1.delete();
                    break;
                case 5:
                    System.out.println("View All Employee ");
                    service1.viewAllEmployee();
                    break;
                default:
                    System.out.println("Please enter valid choice: ");break;
                case 6:
                    System.out.println("Exit  "+"\n Thank you for using This application");break;

            }
        }while(ordering);
    }
}
