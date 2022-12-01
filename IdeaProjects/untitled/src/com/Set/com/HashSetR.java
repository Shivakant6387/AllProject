package com.Set.com;

import java.util.HashSet;

public class HashSetR {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);
        boolean value=set.remove(2);
        System.out.println("removed value"+value);
        boolean value1=set.removeAll(set);
        System.out.println("removed all value"+value1);
    }
}
