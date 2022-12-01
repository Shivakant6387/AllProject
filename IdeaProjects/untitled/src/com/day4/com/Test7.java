package com.day4.com;

public class Test7 {
    public String color;
    public Test7(String color){
        this.color=color;
    }

    public static void main(String[] args) {
        Test7 apple=new Test7("Green");
        System.out.println(apple.color);
    }
}
