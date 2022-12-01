package com.day3.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test11 {
    public static void main(String[] args) {
        List<String>dryFruit=new ArrayList<>();
        dryFruit.add("Walnut");
        dryFruit.add("Apricot");
        dryFruit.add("Almond");
        dryFruit.add("Date");
        ListIterator<String>iterator=dryFruit.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("A")){
                iterator.remove();
            }
        }
        System.out.println(dryFruit);
    }
}
