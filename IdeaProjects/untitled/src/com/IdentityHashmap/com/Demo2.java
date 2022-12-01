package com.IdentityHashmap.com;

import java.util.IdentityHashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<Integer,String>ihm=new IdentityHashMap<>();
        ihm.put(10,"Geeks");
        ihm.put(20,"For");
        ihm.put(30,"Geeks");
        System.out.println(ihm);
        String returns=(String)ihm.put(20,"All");
        System.out.println(returns);
    }
}
