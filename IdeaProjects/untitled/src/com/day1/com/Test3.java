package com.day1.com;

import java.util.IdentityHashMap;
import java.util.WeakHashMap;

public class Test3 {
    public static void main(String[] args) {
        IdentityHashMap<Integer,String>ihm=new IdentityHashMap<>();
        ihm.put(2,"Shyam");
        ihm.put(3,"Lov");
        ihm.put(1,"Kush");
        //unsorted list
        ihm.entrySet().stream().forEach((m)->{
            System.out.println(m.getKey()+""+m.getValue());
        });
        WeakHashMap<Integer,String>whm=new WeakHashMap<>();
        //sorted list
        whm.put(1,"Ram");
        whm.put(3,"Anurag");
        whm.put(2,"Vinay");
        whm.entrySet().stream().forEach((m)->{
            System.out.println(m.getKey()+""+m.getValue());
        });
    }
}
