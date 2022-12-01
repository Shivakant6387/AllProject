package com.day2.com;

import java.util.ArrayList;
import java.util.List;

class Student2{
    private String name;
    private int age ;
    Student2 (String name ,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student["+name+","+age+"]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student2){
            Student2 student2=(Student2) obj;
            if (this.name.equals(student2.name)&&this.age==student2.age){
                return true;

            }
        }
        return false;

    }
}
public class Test2 {
    public static void main(String[] args) {
        List<Student2>list=new ArrayList<>();
        list.add(new Student2("James",20));
        list.add(new Student2("James",25));
        list.add(new Student2("James",24));
        list.add(new Student2("James",25));
        list.add(new Student2("James",25));
//list.remove(new Student2("james",25));
        list.remove(list.get(2));
for (Student2 student:list){
    System.out.println(student);
}
    }
}
