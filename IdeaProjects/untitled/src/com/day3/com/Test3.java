package com.day3.com;

public class Test3 {
    public static void main(String[] args) {
        int a=20;
        int val=--a*a++ +a-- - --a;
        System.out.println("a="+a);
        System.out.println("var="+val);
    }
}
