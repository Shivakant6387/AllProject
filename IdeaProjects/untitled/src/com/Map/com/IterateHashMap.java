package com.Map.com;

import java.util.HashMap;
import java.util.Map.Entry;
public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>lan=new HashMap<>();
            lan.put(1,"Java");
            lan.put(2,"PHP");
            lan.put(3,"Python");
        System.out.println(lan);
        //iterate through the key
        for(Integer key :lan.keySet()){
            System.out.println(key);
        }
        //iterate through the value
        for(String value:lan.values()){
            System.out.println(value);
        }
        //iterate through the key /value entries
        for(Entry<Integer,String>entry:lan.entrySet()){
            System.out.println(entry);
        }
    }
}
