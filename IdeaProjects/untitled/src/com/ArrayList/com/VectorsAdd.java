package com.ArrayList.com;
import java.util.*;
import java.io.*;
public class VectorsAdd {

    public static void main(String[] args) {
        int n=10;
        List<Integer>list=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++)
            list.add(i);
        System.out.println(list);
        list.remove(6);
        System.out.println(list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+"");
        }
    }
}
