package com.Set.com;

import java.util.EnumSet;

public class EnumSets {
    enum Size{
        Small,Medium,Large,Extralarge
    }

    public static void main(String[] args) {
        EnumSet<Size>sizeEnumSet=EnumSet.allOf(Size.class);
       // EnumSet<Size>sizeEnumSet=EnumSet.range(Size.Medium,Size.Extralarge);
        //EnumSet<Size>sizeEnumSet=EnumSet.of(Size.Medium);

        System.out.println(sizeEnumSet);
        EnumSet<Size>set=EnumSet.noneOf(Size.class);
        System.out.println(set);
        set.add(Size.Medium);
        System.out.println(set);
        set.addAll(sizeEnumSet);
        System.out.println(set);
    }
}
