package com.company;

import java.util.HashMap;

public class ValueSet5 {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("four",4);
        hashMap.put("five",5);
        hashMap.put("two",2);
        hashMap.put("one",1);
        hashMap.put("three",3);
        System.out.println(hashMap.values());
    }
}
