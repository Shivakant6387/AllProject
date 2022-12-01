package com.ArrayList.com;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAdd {
    public static void main(String[] args) {
        int n=9;
        List<Integer>l=new LinkedList<Integer>();
        for(int i=1;i<=n;i++)
            l.add(i);
        System.out.println(l);
        l.remove(3);
        System.out.println(l);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+"");
        }

    }
}
