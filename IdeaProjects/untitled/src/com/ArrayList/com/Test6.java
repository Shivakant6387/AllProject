package com.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        String s=new String("Hello");
        List<String >lst=new ArrayList<>();
        lst.add(s);
        lst.add(new String("Hello"));
        lst.add(s);
        s=s.replace("l","L");
        System.out.println(s);
        System.out.println(lst);
    }
}
