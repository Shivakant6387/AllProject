package com.ArrayList.com;
import java.util.*;
import java.io.*;
public class StacksAdd {
    public static void main(String[] args) {
        int n=10;
        List<Integer>s=new Stack<Integer>();
        for(int i=1;i<=n;i++)
            s.add(i);
        System.out.println(s);
        s.remove(9);
        System.out.println(s);
        for(int i=0;i<s.size();i++)
            System.out.println(s.get(i)+" ");

    }
}
