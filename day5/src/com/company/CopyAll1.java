package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CopyAll1 {

    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        HashMap<Integer,String>map2=new HashMap<>();
        map1.put(1,"one");
        map1.put(2,"two");
        map1.put(3,"three");
        map1.put(4,"four");
        map1.put(5,"five");
        System.out.println(map1.keySet());
        System.out.println(map1.values());
   //     Iterator<Integer> iterator=map1.keySet().iterator();

        for (Integer x: map1.keySet()) {
            map2.put(x,map1.get(x));
        }
        System.out.print(map2);

    }
}
