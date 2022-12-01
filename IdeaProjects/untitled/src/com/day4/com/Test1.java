package com.day4.com;
class Demo{

}
class Fighter extends Object{
int age ;
String name;
Fighter(int age,String name){
    this.age=age;
    this.name=name;
}
@Override
    public java.lang.String toString() {
        return "Fighter{"+"age="+age+",name=`"+name+'\''+'}';
    }
}
public class Test1 {
    public static void main(String[] args) {
        Fighter fighter=new Fighter(22,"Shivakant");
        System.out.println(fighter);
        Demo demo=new Demo();
        Fighter fighter1=new Fighter(23,"Sheetel");
        System.out.println(fighter1);
    }
}
