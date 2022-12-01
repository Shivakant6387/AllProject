package com.Arithmetic.com;

public class CalculateArea {
    public static void main(String[] args) {
//        int n=10,n2=3;
//        int area=n*n2/2;
//        System.out.println(area);
        int a=5,b=6,c=7;
        float area;
        float s = (a + b + c) / 2f;
        area= (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(area);

    }
}
