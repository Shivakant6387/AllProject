package com.LambdaException.com;
interface  MyLambdas{
 // public void display(String str);
    public int add(int x,int y);
}
public class LP {
    public static void main(String[] args) {
//        MyLambdas m=(s)->{
//            System.out.println(s);
//        };
//        m.display("Hello world");
        MyLambdas m=(a,b)->a+b;
                //{return a+b;};
        int r=m.add(30,34);
        System.out.println(r);
    }
}
