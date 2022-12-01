package com.Map.com;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<String,Integer>con=new ConcurrentHashMap<>();
        con.put("Java",1);
        con.put("Python",3);
        con.put("PHP",2);
        System.out.println(con);
        int n=con.get("Java");
        System.out.println(n);
        int m=con.remove("Python");
        System.out.println(m);
    }
}
