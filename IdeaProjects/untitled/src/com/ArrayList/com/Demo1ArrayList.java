package com.ArrayList.com;

import java.util.ArrayList;

public class Demo1ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("PHP");
        //System.out.println(list);
        //remove element from the list
//        String str=list.remove(2);
//        System.out.println(str);
//        System.out.println(list);
//        String strs=list.get(1);
//        System.out.println(strs);
        list.set(2,"JavaScript");
        System.out.println(list.size());

    }
}
