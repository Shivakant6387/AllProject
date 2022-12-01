package com.Map.com;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String,Integer>treeMap=new TreeMap<>();
        treeMap.put("two",2);
        treeMap.put("four",4);
        System.out.println(treeMap);
        HashMap<String,Integer>num=new HashMap<>(treeMap);
        num.put("three",3);
        System.out.println(num);
    }
}
