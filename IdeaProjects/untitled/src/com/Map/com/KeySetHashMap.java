package com.Map.com;

import java.util.HashMap;

public class KeySetHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>languages=new HashMap<>();
        languages.put(1,"PHP");
        languages.put(2,"Java");
        languages.put(3,"Python");
        languages.put(4,"JavaScript");
        System.out.println(languages);

        //return set view of key
        //keySet
        System.out.println("Keys"+languages.keySet());

        //return set view of value
        //using value
        System.out.println( "Value"+languages.values());

        //return set view of key/value pairs
        //using entrySet
        System.out.println("Value/key"+languages.entrySet());

    }
}
