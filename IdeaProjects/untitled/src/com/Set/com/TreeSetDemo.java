package com.Set.com;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer>set=new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);
        //Iterator
        Iterator<Integer>iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(",");
        }
    }
}
