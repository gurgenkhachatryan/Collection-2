package com.company.Workday3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyAdd {
    HashSet<Integer> set = new HashSet<>();

    public void my() {
        set.add(5);
        set.add(16);
        set.add(4);
        set.add(38);
        set.add(6);

    }

    HashSet<Integer> set1=new HashSet<>();
    public void my1() {
        set1.add(5);
        set1.add(16);
        set1.add(4);
        set1.add(38);
        set1.add(49);
    }
    TreeSet<String> set2=new TreeSet<>();
    public void myTree()
    {
        set2.add("b");
        set2.add("e");
        set2.add("c");
        set2.add("a");
        set2.add("k");
        set2.add("d");

    }
    TreeSet<String> set3=new TreeSet<>();
    public  void myTree1()
    {
        set3.add("b");
        set3.add("e");
        set3.add("c");
        set3.add("a");
        set3.add("d");
        set3.add("k");
    }
    TreeSet<Integer> setInt=new TreeSet<>();
    public void myTreeInt()
    {
        setInt.add(5);
        setInt.add(35);
        setInt.add(55);
        setInt.add(17);
        setInt.add(28);
        setInt.add(44);
    }

}
