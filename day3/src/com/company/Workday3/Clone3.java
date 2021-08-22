package com.company.Workday3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Clone3 {
    public void cloneSet()
    {
        Set<Integer> newSet=new HashSet<>();
        Iterator<Integer> iteratorNewSet= newSet.iterator();

        MyAdd myAdd=new MyAdd();
        myAdd.my();
        Iterator<Integer> iteratorSet=myAdd.set.iterator();
        while (iteratorSet.hasNext())
        {
           newSet.add(iteratorSet.next());
        }

        for (Integer x:newSet) {
            System.out.print(x + " ");
        }

    }

}
