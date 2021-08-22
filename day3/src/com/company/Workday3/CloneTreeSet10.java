package com.company.Workday3;

import java.util.Iterator;
import java.util.TreeSet;

public class CloneTreeSet10 {
    public void cloneTree() {
        MyAdd myAdd = new MyAdd();
        myAdd.myTree();
        Iterator<String> iterator=myAdd.set2.iterator();
        TreeSet<String> newTreeSet=new TreeSet<>();
        Iterator<String> newIterator= newTreeSet.iterator();
        while (iterator.hasNext())
        {
            newTreeSet.add(iterator.next());
        }
        for (String x:newTreeSet) {
            System.out.print(x + " ");
        }
    }
}
