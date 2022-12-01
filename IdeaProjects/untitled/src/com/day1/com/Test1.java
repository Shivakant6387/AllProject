package com.day1.com;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<String,Integer>map=new TreeMap<>();
        //sorted order
       map.put("Java",1);
        map.put("JavaScript",2);
        map.put("Python",3);
        System.out.println(map);
//        map.remove("Java",1);
//        System.out.println(map);
//        map.replace("Python",2);
//        System.out.println(map);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());
        //System.out.println(map.put("Java",2));
        //System.out.println(map.remove(1));

    }
}
