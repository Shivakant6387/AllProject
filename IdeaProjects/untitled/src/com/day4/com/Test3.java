package com.day4.com;

public class Test3 {
    public  String name;
    public  int age;
    public void Test3(){
        this.name="James";
    }
    public static void main(String args[]){
        Test3 test3=new Test3();
        System.out.println(test3.name);
        System.out.println(test3.age);
        test3.Test3();
        System.out.println(test3);
    }
}
