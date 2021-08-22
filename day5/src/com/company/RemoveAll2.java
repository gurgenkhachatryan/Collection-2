package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class RemoveAll2 {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> hashMap=new ConcurrentHashMap<>();
        hashMap.put(4,"four");
        hashMap.put(5,"five");
        hashMap.put(2,"two");
        hashMap.put(1,"one");
        hashMap.put(3,"three");
        Iterator<Integer> iterator=hashMap.keySet().iterator();
        while (iterator.hasNext())
        {

            hashMap.remove(iterator.next());
        }

    /*    System.out.println(hashMap);
        hashMap.clear();*/
        System.out.println(hashMap);


    }
}
