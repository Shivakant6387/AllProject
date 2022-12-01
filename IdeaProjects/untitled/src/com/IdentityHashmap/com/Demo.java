package com.IdentityHashmap.com;

import java.util.IdentityHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, String> list = new IdentityHashMap<>();
        list.put("Hello", "Sheetal");
        list.put(new String("Hello"), "Ravi");
        System.out.println("Size of IdentityHashMap--"+list.size());
        System.out.println(list);
    }
}