package com.Object.com;

public class Test {
    static int last_roll=100;
    int roll_no;
    Test(){
        roll_no=last_roll;
        last_roll++;
    }
    public int hashCode(){
        return roll_no;
    }

    public static void main(String[] args) {
        Test obj=new Test();
        System.out.println(obj);
        System.out.println(obj.toString());
    }
}
