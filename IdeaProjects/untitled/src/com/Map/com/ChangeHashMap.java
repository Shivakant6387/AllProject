package com.Map.com;

import java.util.HashMap;

public class ChangeHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String>language=new HashMap<>();
        language.put(1,"Java");
        language.put(2,"PHP");
        language.put(3,"JavaScript");
        System.out.println(language);
        //replace value
        language.replace(2,"C++");
        System.out.println(language);

        //remove element associated with key 2
        String val=language.remove(3);
        System.out.println("remove value : "+val);
        System.out.println("updated value"+language);

    }
}
