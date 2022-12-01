package com.ObjectMethod.com;

public class EqualsDemo {
    public static void main(String[] args) {
        Object object=new Object();
        Object obj2=new Object();
        System.out.println(object.equals(obj2));
        Object obj3=object;
        System.out.println(object.equals(obj3));

    }
}
