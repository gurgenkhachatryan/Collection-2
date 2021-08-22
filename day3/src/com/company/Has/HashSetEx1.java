package com.company.Has;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public void hashSetf() {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("null");
        set.add("three");
        set.add("two");
        for (String s : set) {
            System.out.print(s + " ");
        }
        set.remove("null");
        System.out.println();
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(set.size());
        System.out.println();
        System.out.println(set.isEmpty());

    }
}