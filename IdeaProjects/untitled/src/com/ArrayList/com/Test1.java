package com.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

class Student3{
    private String name;
    private int age;
    Student3(String name ,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student["+name+""+age+"]";
    }

    @Override
    public boolean equals(Object obj) {
            if(obj instanceof Student3){
                Student3 std=(Student3)obj;
                if (this.name.equals(std.name) && this.age==std.age){
                    return true;
                }
            }
     return false;
    }
}
public class Test1 {
    public static void main(String[] args) {
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("James", 25));
        students.add(new Student3("James", 27));
        students.add(new Student3("James", 25));
        students.add(new Student3("James", 25));

        students.remove(new Student3("James", 25));

        for(Student3 stud : students) {
            System.out.println(stud);
        }
    }
    }

