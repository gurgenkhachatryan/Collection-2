package com.company.Hashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddArraylist {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(4);
        list.add(1);

        System.out.println(list.toString());
//        for (int i = 0; i < list.size(); i++) {
//            if(list.get(i)%2==1)
//            {
//                list.remove(i);
//            }
//        }
//        System.out.println(list.toString());
//
//        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 != 0) {
                iterator.remove();
            }

        }
        System.out.println(list);
    }
}
