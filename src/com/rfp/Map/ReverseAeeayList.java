package com.rfp.Map;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAeeayList {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(21);
        list.add(30);
        list.add(4);
        for(Integer i:list){
            System.out.print(" "+i);
        }
//        System.out.println();
//        Collections.reverse(list);
//        System.out.println("Reverse Arraylist:");
//        System.out.print(" "+list);
        System.out.println();
        Collections.sort(list);
        System.out.println(list);
    }
}
