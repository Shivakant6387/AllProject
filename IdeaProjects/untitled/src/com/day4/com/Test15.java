package com.day4.com;
class Report{
    public String generateReport(){
        return "CSV";
    }
}
public class Test15 {
    public static void main(String[] args) {
Report rep=new Report();
String csv=rep.generateReport();
Object xlsx=rep.generateReport();
        System.out.println(csv+":"+(String) xlsx);
    }
}
