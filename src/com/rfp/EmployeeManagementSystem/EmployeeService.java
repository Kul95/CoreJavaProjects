package com.rfp.EmployeeManagementSystem;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
    HashSet<Employee>e1=new HashSet<>();
    Employee emp1=new Employee(100,"Kuldeep",26,"Software Engineer","CSE",50000);
    Employee emp2=new Employee(101,"Anmol",28,"Electrical Engineer","EE",30000);
    Employee emp3=new Employee(102,"Manmohan",20,"Mechanical Engineer","ME",40000);
    Employee emp4=new Employee(103,"Rachit",86,"Civil Engineer","CE",54600);
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int age;
    String department;
    String desiganation;
    double salary;
    public EmployeeService(){
        e1.add(emp1);
        e1.add(emp2);
        e1.add(emp3);
        e1.add(emp4);

    }
    boolean found=false;
    public void viewAllEmployee(){
        for(Employee emp:e1){
            System.out.println(emp);
        }
    }
    public void viewEmployee(){
        boolean found=false;
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        for(Employee emp:e1){
            if(emp.getId()==id){
                System.out.println(emp);
                found=true;
            }
        }
        if (!found){
            System.out.println("Employee id is not present.  ");
        }
    }
    public void updateEmployee(){
        System.out.println("Enter the id: ");
        int id=sc.nextInt();
        for(Employee emp:e1){
            if(emp.getId()==id){
                System.out.println("Enter the name:");
                name=sc.nextLine();
                System.out.println("Enter the age");
                age=sc.nextInt();
                System.out.println("Enter the designation : ");
                desiganation=sc.nextLine();
                System.out.println("Enter the department: ");
                department=sc.nextLine();
                System.out.println("Enter the salary: ");
                salary=sc.nextInt();
                emp.setName(name);
                emp.setAge(age);
                emp.setDesiganation(desiganation);
                emp.setDepartment(department);
                emp.setSalary(salary);
                System.out.println("Updated details of employee are: ");
                System.out.println(emp);
                found=true;
            }
        }
        if (!found){
            System.out.println("Employee is not present: ");
        }else {
            System.out.println("Employee details updated successfully.");
        }
    }
    public void delete(){
        System.out.println("Enter the id: ");
        id=sc.nextInt();
        Employee empdelete=null;
        for(Employee emp: e1){
            if(emp.getId()==id){
                empdelete=emp;
                found=true;
            }
        }
        if (!found){
            System.out.println("Employee is not present!");
        }else{
            e1.remove(empdelete);
            System.out.println("Employee deleted successfully.");
        }
    }
    public void insertEmployee(){
        System.out.println("Enter the id: ");
        id=sc.nextInt();
        System.out.println("Enter the name:");
        name=sc.nextLine();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the designation : ");
        desiganation=sc.nextLine();
        System.out.println("Enter the department: ");
        department=sc.nextLine();
        System.out.println("Enter the salary: ");
        salary=sc.nextInt();
        Employee emp=new Employee(id,name,age,desiganation,department,salary);
        e1.add(emp);
        System.out.println("Employee added successfully: ");
    }
}
