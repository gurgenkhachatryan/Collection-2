package com.company.Workday3;

import java.util.Iterator;
import java.util.TreeSet;

public class HashConvertTree4 {
    public void hashTree()
    {
        TreeSet<Integer> treeSet=new TreeSet<>();
        Iterator<Integer> iteratorTree= treeSet.iterator();

        MyAdd myAdd=new MyAdd();
        myAdd.my();

        Iterator<Integer> iterator=myAdd.set.iterator();
        while (iterator.hasNext())
        {
            treeSet.add(iterator.next());
        }

        for (Integer x: treeSet) {
            System.out.print(x + " ");
        }

    }
}
