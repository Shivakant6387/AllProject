package com.ObjectMethod.com;

import java.util.ArrayList;

public class GetClassTest {
    public static void main(String[] args) {
        Object obj1=new Object();
        System.out.println(obj1.getClass());
        String obj2=new String();
        System.out.println(obj2.getClass());
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list.getClass());
    }
}
