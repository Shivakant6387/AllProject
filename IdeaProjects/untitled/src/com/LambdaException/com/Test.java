package com.LambdaException.com;
interface MyLambda{
    public void display();
}
/*
class My implements MyLambda{
    public void display(){
        System.out.println("Hello World");
    }
}

 */
public class Test {
    public static void main(String[] args) {
        MyLambda m=()->{
            System.out.println("Hello world");
        };
        m.display();
    }
}
