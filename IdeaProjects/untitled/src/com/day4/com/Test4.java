package com.day4.com;

public class Test4 {
    static int i1=  1;
    public static void change(int num){
        num++;
        System.out.println(num);
    }

    public static void main(String[] args) {
        //Test4 test4=new Test4();
        Test4.change(i1);
        System.out.println(i1);
        System.out.println(++i1);
    }
}
