package com.Map.com;

import java.util.LinkedHashMap;

public class RemoveLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String ,Integer> numbers=new LinkedHashMap<>();
        numbers.put("Five",5);
        numbers.put("One",1);
        numbers.put("Three",3);
        System.out.println(numbers);
        int val=numbers.remove("One");
        System.out.println(val);
        boolean val2=numbers.remove("Three",3);
        System.out.println(val2);
        System.out.println(numbers);
    }
}
