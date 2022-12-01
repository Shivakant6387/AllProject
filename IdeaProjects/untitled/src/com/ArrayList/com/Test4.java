package com.ArrayList.com;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<StringBuilder> dryFruits=new ArrayList<>();
        dryFruits.add(new StringBuilder("Walnut"));
        dryFruits.add(new StringBuilder("Apricot"));
        dryFruits.add(new StringBuilder("Almond"));
        Boolean bool=true;
        for(int i=0;i<dryFruits.size();i++){
            if(i==0){
                bool=dryFruits.remove(new StringBuilder("Almond"));
            }
        }
        System.out.println(bool.toString());
        System.out.println(dryFruits);
    }
}
