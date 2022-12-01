package com.day1.com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String ,Integer>hm=new HashMap<>();
        //follow  queue
        hm.put("Java",2);
        hm.put("MySQl",8);
        hm.put("Python",3);
        System.out.println(hm);
//        hm.remove("Java");
//        System.out.println(hm);
        hm.entrySet().stream().forEach((m)->{
            System.out.println(m.getKey()+""+m.getValue());
        });
        LinkedHashMap<Integer,String>lhm;
        lhm=new LinkedHashMap<>();
//        lhm.put("C",4);
//        lhm.put("PHP",9);
//        lhm.put("C++",5);
//        System.out.println(lhm);
//        lhm.remove("C");
//        System.out.println(lhm);
        lhm.put(100,"Amit");
        lhm.put(102,"Shyam");
        lhm.put(103,"Ajit");
        lhm.put(null,"Vinay");
        lhm.entrySet().stream().forEach((m)->{
            System.out.println(m.getKey()+"" +m.getValue());
        });
    }
}
