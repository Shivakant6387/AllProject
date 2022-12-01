package com.LambdaException.com;
interface MyLD{
    public void display();
}
class Demo{
    public  void method1(){
MyLD ml=()->{
    int count=0;
    //count++;
    System.out.println("hi");
    System.out.println("Bye"+count);
};
ml.display();
    }
}
public class LD2 {
    public static void main(String[] args) {
        Demo m=new Demo();
        m.method1();
    }
}
