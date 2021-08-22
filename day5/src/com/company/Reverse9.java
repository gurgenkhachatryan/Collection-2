package com.company;

import java.util.*;

public class Reverse9 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();
        hashMap.put(5, "five");
        hashMap.put(1, "one");
        hashMap.put(4, "four");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        System.out.println(hashMap);


        ArrayList<Integer> list = new ArrayList<>();

        for (Integer x: hashMap.keySet() ) {
            list.add(x);
        }
        System.out.println(list);
        Collections.reverse(list);
        for (Integer x: list) {
            linkedHashMap.put(x, hashMap.get(x));
        }
        System.out.println(linkedHashMap);


         }
}
