package com.Map.com;

import java.util.HashMap;

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<String,Integer>language=new HashMap<>();
        language.put("Java",8);
        language.put("JavaScript",2);
        language.put("Python",9);
        language.put("PHP",1);
        language.put("MySql",5);
        System.out.println("HashMap"+language);
    }
}
