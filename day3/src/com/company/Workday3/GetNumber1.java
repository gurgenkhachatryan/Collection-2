package com.company.Workday3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetNumber1 {
    public void getNumber() {
        MyAdd myAdd = new MyAdd();
        myAdd.my();
        Iterator<Integer> iterator = myAdd.set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
