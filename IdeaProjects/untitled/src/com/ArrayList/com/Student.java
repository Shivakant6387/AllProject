package com.ArrayList.com;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
class Student2{
    private String  name ;
    private int age;
    Student2(String name , int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return "Student2["+name +""+age+"]";
    }
}
public class Student {
    public static void main(String[] args) {
List<Student2>Students=new ArrayList<>();
Students.add(new Student2("James",22));

        Students.add(new Student2("James",29));

        Students.add(new Student2("James",27));

        Students.add(new Student2("James",28));
        Boolean bool =Students.remove(Students.get(3));
        System.out.println(bool);
        for(Student2 std :Students){
            System.out.println(std);
        }
    }
}
