package com.day2.com;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        int n=10;
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=n;i++)
            list.add(i);
            System.out.println(list);
            for (int i=0;i<list.size();i++){

                System.out.println(list.get(i)+"");
        }
    }
}
