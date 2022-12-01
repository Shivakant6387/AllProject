package com.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        List<StringBuilder> list=new ArrayList<>();
        list.add(sb);
        list.add(new StringBuilder("Hello"));
        System.out.println(list);
        list.add(sb);
        System.out.println(list);
        sb.append("World");
        System.out.println(list);
    }
}
