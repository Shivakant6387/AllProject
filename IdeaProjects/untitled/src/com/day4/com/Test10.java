package com.day4.com;

public class Test10 {
    private static void m(int x){
        System.out.println("Int version"+x);
    }
    private  static void m(char x){
        System.out.println("char version");
    }
    public static void main(String[] args) {
int i='5';
m(i);
m('5');
    }
}
