package com.Interface.com;

public class BankTest {
    public static void main(String[] args) {
        Bank bank=new PNB();
        bank.rateOfInterest();
        Bank bank1 = new SBI();
        System.out.println("ROI:"+bank1.rateOfInterest());
    }
}
