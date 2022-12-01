package com.Map.com;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();
        //insert element
        map.put("one",1);
        map.put("two",2);
        System.out.println(map);
        //Access keys of the map
        System.out.println("Keys"+map.keySet());
        //access values of the map
        System.out.println("Value"+map.values());
        //access entries of the map
        System.out.println("Entries"+map.entrySet());
        //remove element from the map
        int value=map.remove("two");
        System.out.println("Remove value"+ value);
    }
}
