package com.ObjectMethod.com;

public class CloneTest3 implements Cloneable{
    String name;
    int version;

    public static void main(String[] args) {
        CloneTest3 obj1= new CloneTest3();
        obj1.name="java";
        obj1.version=14;
        System.out.println(obj1.name);
        System.out.println(obj1.version);
        try{
            CloneTest3 obj2=(CloneTest3) obj1.clone();
            System.out.println(obj2.name);
            System.out.println(obj2.version);
            obj2.name="Python";
            obj2.version=12;
            System.out.println(obj2.name);
            System.out.println(obj2.version);
            System.out.println(obj1.name);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
