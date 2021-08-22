package com.company;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeMap;

public class CopyTree7 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        TreeMap<Integer,String> newTreemap=new TreeMap<>();
        treeMap.put(5,"five");
        treeMap.put(1,"one");
        treeMap.put(4,"four");
        treeMap.put(2,"two");
        treeMap.put(3,"three");
        Iterator<Integer> iterator=treeMap.keySet().iterator();
        while (iterator.hasNext())
        {
            Integer key= iterator.next();

            newTreemap.put(key, treeMap.get(key));
        }
        System.out.println(treeMap);
        System.out.println(newTreemap);
    }
}
