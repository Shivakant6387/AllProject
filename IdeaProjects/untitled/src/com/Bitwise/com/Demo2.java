package com.Bitwise.com;

public class Demo2 {
    public static void main(String[] args) {
       // int a=10,b=15;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println(a+" "+b);
        byte a=9,b=12;
        byte c;
               c =(byte)(a<<4);
               c=(byte) (c|b);
        System.out.println((c&0b11110000)>>4);


    }
}
