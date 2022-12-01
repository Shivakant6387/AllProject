package com.day4.com;
class Rectangle{
    private int height;
    private int width;
    public Rectangle(int height,int width){
        this.height=height;
        this.width=width;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
}
public class Test9 {
    public static void main(String[] args) {
        int i=100;
        int j=200;
        Rectangle rectangle=new Rectangle(i,j);
        System.out.println(rectangle.getHeight()+" ,"+rectangle.getWidth());
    }
}
