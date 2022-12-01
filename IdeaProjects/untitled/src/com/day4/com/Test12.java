package com.day4.com;
class Point1{
    static int x;
    //private int y;
static int y;
    public String toString(){
        return  "Point("+x+","+y+")";
    }
}
public class Test12 {
    public static void main(String[] args) {
        Point1 p1=new Point1();
        p1.x=100;
        p1.y=200;
        Point1 p2 =new Point1();
        p2.x=100;
        p2.y=200;
        System.out.println(p1);

    }
}
