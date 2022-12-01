package com.day3.com;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch (x){
            default:
                System.out.println("still no idea what x is ");
                break;
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to3");
                break;
        }
    }
}
