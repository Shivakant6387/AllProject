package com.Set.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(6);
        System.out.println(set);
        //calling iterator()method
        Iterator<Integer>iterate= set.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next());
            System.out.print(",");
        }

    }
}
