package com.Map.com;

import java.util.HashMap;

public class AccessValueHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>language=new HashMap<>();
        language.put(1,"Java");
        language.put(3,"Python");
        language.put(2,"PHP");
        language.put(4,"JavaScript");
        System.out.println(language);
        String value= language.get(3);
        System.out.println(value);

    }
}
