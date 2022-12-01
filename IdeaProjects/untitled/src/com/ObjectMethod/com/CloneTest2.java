package com.ObjectMethod.com;

public class CloneTest2 implements  Cloneable {
    String name;
    int version;
    public static void main(String[] args) {
        CloneTest2 obj1=new CloneTest2();
        obj1.name="java";
        obj1.version=14;
        System.out.println(obj1.name);
        System.out.println(obj1.version);
        try{
            CloneTest2 obj2=(CloneTest2)obj1.clone();
            System.out.println(obj2.name);
            System.out.println(obj2.version);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
