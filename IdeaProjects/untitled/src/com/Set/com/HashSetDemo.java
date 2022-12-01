package com.Set.com;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(2);
        set.add(3);
        System.out.println(set);
        Set<Integer>set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        System.out.println(set1);
        set1.addAll(set);
        System.out.println("Union"+set1);
    }
}
