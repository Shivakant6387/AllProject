package com.Map.com;

import java.util.LinkedHashMap;

public class UsedPutAllLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>evenNum=new LinkedHashMap<>();
        evenNum.put("two",2);
        evenNum.put("four",4);
        System.out.println(evenNum);
        evenNum.putIfAbsent("six",6);
        System.out.println("Updated value"+evenNum);
        LinkedHashMap<String ,Integer>odd=new LinkedHashMap<>();
        odd.put("one",1);
        System.out.println(odd);
        odd.putAll(evenNum);
        System.out.println("New LinkedHashMap"+odd);
    }
}
