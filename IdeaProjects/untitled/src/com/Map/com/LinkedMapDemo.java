package com.Map.com;

import java.util.LinkedHashMap;

public class LinkedMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String , Integer>val=new LinkedHashMap<>();
        val.put("two",2);
        val.put("four",4);
        System.out.println(val);
        LinkedHashMap<String,Integer>val1=new LinkedHashMap<>(val);
        val1.put("three",3);
        System.out.println(val1);
    }
}
