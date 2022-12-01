package com.Map.com;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapE {
    public static void main(String[] args) {
        //create treeMap
        TreeMap<Integer,String>treemap=new TreeMap<>();
        treemap.put(3,"three");
        treemap.put(9,"nine");
            treemap.put(4,"four");
            treemap.put(2,"two");
        treemap.put(1,"one");
        treemap.put(8,"eight");
        treemap.put(7,"seven");

        System.out.println(treemap);
        HashMap<String,Integer>map=new HashMap<>();
        map.put("two",2);
        map.put("Four",4);
        map.put("three",3);

        System.out.println(map);
        HashMap<String, Integer>maps=new HashMap<>(map);
        maps.put("three",3);
        System.out.println(maps);
    }
}
