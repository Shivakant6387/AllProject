package com.Map.com;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapForEach {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);
        //foreach
       map.forEach(4,(k,v)->System.out.println("key"+k+"value"+v));
       map.forEach(4,(k,v)->v,(v)-> System.out.println(v+""));
       //search
        String key=map.search(4,(k,v)->{return v==7?k:null;});
        System.out.println(key);
        //reduce
        int sum=map.reduce(4,(k,v)->v,(v1,v2)->v1+v2);
        System.out.println(sum);
    }
}
