package com.company.Workday3;

import java.util.Iterator;

public class MinSeven13 {
    public void minSeven()
    {
        MyAdd myAdd=new MyAdd();
        myAdd.my();
        Iterator<Integer> iterator=myAdd.set.iterator();
//        while (iterator.hasNext())
//        {
//           // Integer current = iterator.next();
//            if(iterator.next().compareTo(7)<0)
//            {
//                System.out.print(iterator.next() +",");
//            }
//        }
        for (Integer x: myAdd.set) {
            if(x<7)
            {
                System.out.print(x +",");
            }
        }
    }
}
