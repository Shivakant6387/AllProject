package com.day1.com;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test4 {
    public static void main(String[] args) {
        SortedMap<Integer,String>sm=new TreeMap<>();
        //sorted order
        sm.put(2,"ram");
        sm.put(1,"sita");
        sm.put(4,"lakshmad");
        sm.put(3,"bharat");
        System.out.println(sm);
        NavigableMap<Integer,String>nm=new TreeMap<>();
        //sorted order
        nm.put(3,"kawir");
        nm.put(1,"tulshidath");
        nm.put(4,"rahim");
        nm.put(2,"swamsunder");
        System.out.println(nm);
    }
}
