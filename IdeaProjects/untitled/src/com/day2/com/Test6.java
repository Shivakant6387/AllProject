package com.day2.com;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        String sr=new String("Hello");
        List<String>list=new ArrayList<>();
        list.add(sr);
        list.add(new String("Hello"));
        list.add(sr);
        sr=sr.replace("e","E");
        System.out.println(sr);
        System.out.println(list);
    }
}
