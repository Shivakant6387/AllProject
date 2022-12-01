package com.Map.com;

import java.util.HashMap;
import java.util.Map;

public class MapImplement {
    public static void main(String[] args) {
        //creating a map using the hashmap
        Map<Integer,String>map=new HashMap<>();
        //insert element to the map
        map.put(2,"two");
        map.put(3,"three");
        map.put(1,"One");
        System.out.println(map);
        //Access ket of the map
        System.out.println(map.keySet());
        // Access value of the map
        System.out.println(map.values());
        //Access key/value of the map
        System.out.println(map.entrySet());
        //remove element to the map

//        map.remove(2);
//        System.out.println(map);
        //replace element to the map
        map.replace(2,"five");
        System.out.println(map);
    }
}
