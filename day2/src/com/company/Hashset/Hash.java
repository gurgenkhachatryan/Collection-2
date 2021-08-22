package com.company.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("as");
        linkedHashSet.add("kjb");
        linkedHashSet.add("as");
        System.out.println(linkedHashSet);


        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(6);
        System.out.println(treeSet);
        for(Integer x:treeSet)
        {
            System.out.println(x);
        }
        Iterator<Integer> iterator=treeSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
