package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class FirstLast8 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(5,"five");
        hashMap.put(1,"one");
        hashMap.put(4,"four");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        System.out.println(hashMap);
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        Iterator<Integer> iterator=hashMap.keySet().iterator();
        while (iterator.hasNext())
        {
            Integer  key= iterator.next();
            treeMap.put(key,hashMap.get(key) );
        }

        System.out.print(treeMap);
        System.out.println();
        System.out.println("first key=" + treeMap.firstKey());
        System.out.println("last key=" + treeMap.lastKey());
    }
}
