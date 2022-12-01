package com.day4.com;

public class Test2 {
    String msg=null;
    public Test2(){
        this("Good morning");
    }
    public Test2(String str){
    msg=str;
    }
    public void display(){
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Test2 g1=new Test2();
        Test2 g2=new Test2("Good evening");
        g1.display();
        g2.display();
    }
}
