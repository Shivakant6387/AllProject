package com.ArrayList.com;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<String> dryFruits=new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");
        for(String dryFruit : dryFruits){
            if(dryFruit.startsWith("A")){
                dryFruits.remove(dryFruit);
            }
        }
        System.out.println(dryFruits);
    }
}
