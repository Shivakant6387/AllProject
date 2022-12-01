package com.Map.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
public class HashMapIterate {
    public static void main(String[] args) {
        //creating hashmap
        HashMap<Integer,String>it=new HashMap<>();
        it.put(1,"java");
        it.put(3,"Python");
        it.put(2,"PHP");
        it.put(4,"JavaScript");
        System.out.println(it);
        //iterate though the key only
        for(Integer key : it.keySet()){
            System.out.println(key);
        }
        //iterate though the value only
        for(String value : it.values()){
            System.out.println(value);
        }
        //iterate though the key/value
        for(Entry<Integer,String>entry : it.entrySet()){
            System.out.println(entry);
        }
    }
}
