package com.company.Workday3;

import java.util.ArrayList;
import java.util.Iterator;

public class HashConvertArrayList5 {
    public void HashArray() {
        ArrayList<Integer> arrayList=new ArrayList<>();


        MyAdd myAdd = new MyAdd();
        myAdd.my();
        Iterator<Integer> iteratorHash=myAdd.set.iterator();
        while (iteratorHash.hasNext())
        {
            arrayList.add(iteratorHash.next());
        }
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }




    }
}