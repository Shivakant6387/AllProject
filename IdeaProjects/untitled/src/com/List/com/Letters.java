package com.List.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letters {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("A");
        list.add("b");
        list.add("c");
        System.out.println(list);
        String []str=new String[list.size()];
        str=list.toArray(str);
        System.out.println(Arrays.toString(str));
    }
}
