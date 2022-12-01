package com.ArrayList.com;

import java.util.LinkedList;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {
        List<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // access element from the list
        int num=list.get(2);
        System.out.println(num);
        //remove
        int removes=list.remove(1);
        System.out.println(removes);
        //Use indexOf method
        int index=list.indexOf(3);
        System.out.println(index);
    }
}
