package com.Arithmetic.com;

import java.util.Scanner;

public class Cubiob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length , breadth,height;
        int TotalArea,Volume;
        System.out.println("Enter the value of h , b ,l");
        length=sc.nextInt();
        breadth= sc.nextInt();
        height=sc.nextInt();
        TotalArea=2*(length*height+breadth*height+length*breadth);
        Volume=length*breadth*height;
        System.out.println(TotalArea);
        System.out.println(Volume);
    }
}
