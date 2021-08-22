package com.company.Workday3;

import java.util.Iterator;
import java.util.TreeSet;

public class CompareTree12 {
    public boolean compareTree() {
        MyAdd myAdd = new MyAdd();

        myAdd.myTree();
        Iterator<String> iterator = myAdd.set2.iterator();


        TreeSet<String> set3=new TreeSet<>();
            set3.add("b");
            set3.add("e");
            set3.add("c");
            set3.add("a");
            set3.add("d");
            set3.add("o");
     //   myAdd.myTree1();
        Iterator<String> newIterator =set3.iterator();
        boolean flag = false;
        if (myAdd.set2.size() == set3.size()) {
            while (newIterator.hasNext()) {
                if (newIterator.next().compareTo(iterator.next()) == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}