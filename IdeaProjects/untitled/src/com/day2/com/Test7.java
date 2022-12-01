package com.day2.com;
class MyClass{
    int Age;
    String name;
    MyClass(){

    }
    MyClass(int Age,String name){
        this.Age=Age;
        this.name=name;
    }
}
public class Test7 {
    public static void main(String[] args) {
        MyClass myClass=new MyClass(23,"Ravi");

    }
}
