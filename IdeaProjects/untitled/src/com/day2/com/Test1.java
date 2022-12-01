package com.day2.com;

import java.util.ArrayList;
import java.util.List;
class Students{
    private String name;
    private int age;
    Students(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student["+name+","+age+"]";
    }
}
public class Test1 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add(String.valueOf(new Students("James",21)));
        list.add(String.valueOf( new Students("Bond",22)));
        list.add(String.valueOf(new Students("Hari",23)));
        list.add(String.valueOf(new Students("Sado",25)));
    boolean bool=list.remove(list.get(2));
        System.out.println(bool);
        for (String st :list){
            System.out.println(st);
        }
    }
}
