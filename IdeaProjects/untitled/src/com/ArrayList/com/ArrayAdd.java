package com.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdd {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);
        //Access element from the list
        int number =list.get(2);
        System.out.println("Accessed Element:"+number);
        //remove element from the list
        int removeNum=list.remove(1);
        System.out.println("Removed element :"+removeNum);
    }
}
