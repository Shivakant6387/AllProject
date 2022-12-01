package com.Map.com;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String , Integer> numbers=new TreeMap<>();
        numbers.put("Second",2);
        numbers.put("First",1);
        System.out.println("Map using treemap"+numbers);
        //replace values
        numbers.replace("First",11);
        numbers.replace("Second",12);
        System.out.println("replace value"+numbers);
        int removes=numbers.remove("First");
        System.out.println("remove value: "+removes);
    }
}
