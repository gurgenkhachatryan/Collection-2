package com.company.Workday3;

import java.util.Iterator;

public class CompareHashSet6 {
    public boolean compare() {
        MyAdd myAdd = new MyAdd();
        myAdd.my();
        Iterator<Integer> iteratorMy = myAdd.set.iterator();

        myAdd.my1();
        Iterator<Integer> iteratorMy1 = myAdd.set1.iterator();
        boolean flag = false;
        if (myAdd.set.size() == myAdd.set1.size()) {
            while (iteratorMy.hasNext()) {
                if (iteratorMy1.next().compareTo(iteratorMy.next()) == 0) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }


            }
            return flag;
        }
        return flag;
    }
}
