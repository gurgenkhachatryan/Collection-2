package com.company.Workday3;

import java.util.Iterator;

public class GreatOrEqual14 {
    public void greatOrEqual(int number) {
        MyAdd myAdd = new MyAdd();
        myAdd.myTreeInt();
        for (Integer x: myAdd.setInt) {
            if(x>=number)
            {
                System.out.print(x + " ");
            }
        }


//        Iterator<Integer> iterator = myAdd.setInt.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next() >= number) {
//                System.out.print(iterator.next() + " ");
//            }
//        }
    }
}
