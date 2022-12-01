package com.Map.com;

import java.util.LinkedHashMap;

public class AccessKeyLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>number=new LinkedHashMap<>();
        number.put("Two",2);
        number.put("four",4);
        System.out.println(number);
        //entrySet
        System.out.println("EntrySet key/value"+number.entrySet());
        //values
        System.out.println("Value"+number.values());
        //key/value
        System.out.println("key"+number.keySet());
        //get()
        int val=number.get("Two");
        System.out.println("return value : "+val);
        int val2=number.getOrDefault("Three",3);
        System.out.println("return value : "+val2);
//        try {
//
//            int val = number.get(2);
//            System.out.println(val);
//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
