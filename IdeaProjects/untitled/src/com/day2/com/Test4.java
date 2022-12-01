package com.day2.com;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        String s=new String("Hello");
        List<String> list=new ArrayList<>();
        list.add(s);
        s=s.replace("l","L");
        System.out.println(s);
        System.out.println(list);

    }
}
