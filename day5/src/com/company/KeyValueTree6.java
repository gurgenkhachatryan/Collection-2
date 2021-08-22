package com.company;

import java.util.TreeMap;

public class KeyValueTree6 {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"five");
        treeMap.put(1,"one");
        treeMap.put(4,"four");
        treeMap.put(2,"two");
        treeMap.put(3,"three");
        System.out.println(treeMap);
    }
}