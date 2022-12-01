package com.day4.com;

public class T8 {
    public static void main(String[] args) {
        double price=90000;
        String model = null;
        if(price>100000){
            model="Tesla Model X";
        } else if (price <=100000) {
            model="Tesla Model S";
        }
        System.out.println(model);
    }
}
