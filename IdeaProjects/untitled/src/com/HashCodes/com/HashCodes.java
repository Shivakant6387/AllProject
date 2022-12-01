package com.HashCodes.com;

import java.util.ArrayList;

public class HashCodes {
    public static void main(String[] args) {
//        Object obj1=new Object();
//        System.out.println(obj1.hashCode());
//        Object obj2=new Object();
//        System.out.println(obj2.hashCode());
//        Object obj3=new Object();
//        System.out.println(obj3.hashCode());
        String str=new String();
        System.out.println(str.hashCode());
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list.hashCode());
        Object obj1=new Object();
        Object obj2=obj1;
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
