package com.day2.com;

import java.util.ArrayList;
import java.util.List;

public class Test41 {
    public static void main(String[] args) {
        List<StringBuilder> dryFruits = new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        dryFruits.add(new StringBuilder("Date"));
        Boolean b = true;

        for(int i = 0; i < dryFruits.size(); i++)
        {
            if(i == 0) {
                b = dryFruits.remove(new StringBuilder("Almond"));
            }
        }

        System.out.println(b.toString());
        System.out.println(dryFruits);
    }
}
