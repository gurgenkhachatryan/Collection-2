package com.company.Workday3;

import java.util.Iterator;

public class IterateTree8 {
    public  void  iterate()
    {
        MyAdd myAdd=new MyAdd();
        myAdd.myTree();
        Iterator<String> iterator=myAdd.set2.iterator();
        while (iterator.hasNext())
        {
            System.out.print(iterator.next() + " ");
        }

    }


}
