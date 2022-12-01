package com.Map.com;

import java.util.LinkedHashMap;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("one",1);

        lhm.put("two",2);
        lhm.put("one",1);
        System.out.println(lhm);
        //using putIfAbsent
        lhm.putIfAbsent("Seven",7);
        System.out.println(lhm);
        LinkedHashMap<String , Integer>m=new LinkedHashMap<>();
        m.put("three",3);
        m.putAll(lhm);
        System.out.println(m);
    }
}
