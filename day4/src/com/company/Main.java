package com.company;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	Student[] students={new Student("aa",25),
//            new Student("xx",26),
//            new Student("ll",5)};
       // List<Student> list=new ArrayList<>(Arrays.asList())

        Student student1=new Student("AAA",18,2);
        Student student2=new Student("BBB",20,3);
        Student student3=new Student("CCC",22,4);
        TreeMap<Double,Student> treeMap=new TreeMap<>();
        treeMap.put(4.5,student1);
        treeMap.put(5.4,student2);
        treeMap.put(8.9,student3);
        System.out.println(treeMap);

    }
}
