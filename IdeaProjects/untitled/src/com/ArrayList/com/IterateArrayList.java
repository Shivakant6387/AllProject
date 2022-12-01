package com.ArrayList.com;

import java.util.ArrayList;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Cat");
        list.add("Dog");
        list.add("Ass");
        System.out.println(list);
        //iterate use for each loop
        System.out.println("Accessed element");
        for(String str :list){
            System.out.print(str);
            System.out.print(",");
        }
    }
}
