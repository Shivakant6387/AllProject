package com.day4.com;

public class Test13 {
    private static void add(double d1,double d2){
        System.out.println("double version"+(d1+d2));
    }
    private static void add(Double d1,Double d2){
        System.out.println("double version"+(d1+d2));
    }

    public static void main(String[] args) {
        add(10.0,Integer.valueOf(10));
    }
}
