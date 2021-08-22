package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

public class LeastKey11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        hashMap.put(40, "four");
        hashMap.put(5, "five");
        hashMap.put(24, "two");
        hashMap.put(18, "one");
        hashMap.put(33, "three");
        System.out.println("hashMap=" + hashMap);
        for (Integer x: hashMap.keySet()) {
            treeMap.put(x,hashMap.get(x));
        }
        System.out.println("treeMap=" + treeMap);
        Random random = new Random();
        int randomKey = random.nextInt(50);
        System.out.println("randomKey=" + randomKey);
        for (Integer x :treeMap.keySet()) {
            if (x >= randomKey) {
                System.out.println(x + " " + treeMap.get(x));
                return;
            }
        }
        System.out.println("nul \n is not key greater or equal this randomKey");

    }
}
