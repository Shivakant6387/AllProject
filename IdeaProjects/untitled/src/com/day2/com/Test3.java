package com.day2.com;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String>lists=new ArrayList<>();
        lists.add("Walnut");
        lists.add("Apricot");
        lists.add("Almond");
        lists.add("Date");
    try
    {
        for(String list:lists){
            if (list.startsWith("A")){
                lists.remove(list);
            }
        }

    }
    catch (Exception e){
        System.out.println(e);
    }
        System.out.println(lists);
    }
}
