package com.Map.com;

import java.util.LinkedHashMap;

public class LinkedHashMapAccess {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>access=new LinkedHashMap<>();
        access.put("two",2);
        access.put("four",4);
        access.put("three",3);
        System.out.println(access);
        //access element
        System.out.println(access.keySet());
        System.out.println(access.values());
        System.out.println(access.entrySet());
        //get
        System.out.println(access.get("two"));
        // get or Default
        int v=access.getOrDefault("five",5);
        System.out.println(v);
        //size
        System.out.println(access.size());
        //remove
        int v2=access.remove("two");
        System.out.println("remove"+v2);
    }
}
