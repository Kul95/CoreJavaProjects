package com.rfp.MiniProject1;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeServices {
    HashMap<Integer,EmployeeContact>list=new HashMap<>();
    EmployeeContact e1=new EmployeeContact(1,"Kuldeep","IMT","Gurgoan","Hariyana",129878,987689786,"kuldeep@gmail.com");
    EmployeeContact e2=new EmployeeContact(2,"Sonam","NCR","NSP","Delhi",129878,897689786,"sonam@gmail.com");
    EmployeeContact e3=new EmployeeContact(3,"John","KMP","Chandigarh","Punjab",856987,817689786,"john@gmail.com");
    EmployeeContact e4=new EmployeeContact(4,"Ankit","JD Terminal","Kanpur","Uttar Pradesh",779878,769689786,"ankit@gmail.com");
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    String address;
    String city;
    String state;
    int zipCode;
    long phoneNumber;
    String email;
    public EmployeeServices(){
        list.put(10,e1);
        list.put(20,e2);
        list.put(30,e3);
        list.put(40,e4);
    }

    public void viewAllEmployee(){
//        for(EmployeeContact i:list){
//            System.out.println(i);
//        }
    }

}
