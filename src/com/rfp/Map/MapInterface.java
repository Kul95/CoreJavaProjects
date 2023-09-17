package com.rfp.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        HashMap<String,Integer> mp=new HashMap();
        mp.put("India",150);
        mp.put("Chaina",100);
        mp.put("USA",50);
        mp.put("UK",36);
        System.out.println(mp);
        mp.put("UK",300);
        System.out.println(mp);
//        if(mp.containsKey("USA")){
//            System.out.println("Key is present.");
//        }else {
//            System.out.println("Key is not present .");
//        }
//        System.out.println(mp.get("UK"));
//        System.out.println(mp.get("India"));
//        System.out.println(mp.get("Komal"));

//       for(Map.Entry<String,Integer>e:mp.entrySet()){
//           System.out.println(e.getKey());
//           System.out.println(e.getValue());
//       }
        Set<String>keys=mp.keySet();
       for(String key: keys){
           System.out.println(key+" "+mp.get(key));
       }
    }
}
