package com.Map.com;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMaps {
    public static void main(String[] args) {
        ConcurrentMap<String,Integer>cons=new ConcurrentHashMap<>();
        cons.put("Java",1);
        cons.put("PHP",3);
        cons.put("two",2);
        cons.put("four",4);
        cons.put("three",3);
        System.out.println(cons);
        ConcurrentMap<String,Integer>val=new ConcurrentHashMap<>(cons);
        val.put("three",3);
        System.out.println(val);
    }
}
