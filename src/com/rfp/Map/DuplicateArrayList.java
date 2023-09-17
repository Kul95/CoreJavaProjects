package com.rfp.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(20);
        list.add(30);
        for(Integer i:list){
            System.out.print(" "+i);
        }
        System.out.println("\n");
        Set<Integer>st=new HashSet<>(list);
        System.out.println(st);
        List<Integer>list1=new ArrayList<>(st);
        System.out.println(list1);


    }
}
