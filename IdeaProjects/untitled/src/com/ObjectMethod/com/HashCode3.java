package com.ObjectMethod.com;

public class HashCode3 {
    public static void main(String[] args) {
        Object obj1=new Object();
        Object obj2=obj1;
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
