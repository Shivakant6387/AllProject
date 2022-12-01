package com.ArrayList.com;
import java.util.*;
import java.awt.List;
public class ConcurrentS {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()) {
//            Integer value = it.next();
//            System.out.println("List Value:" + value);
//            if (value.equals(3))
//                list.remove(value);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3,3);

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            Integer key = it.next();
            System.out.println("Map Value:" + map.get(key));
            if (key.equals(2)) {
                map.put(1, 4);
            }
        }
    }
}
