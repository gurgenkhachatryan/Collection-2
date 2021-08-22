package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class GreaterKey10 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(2, "two");
        hashMap.put(1, "one");
        hashMap.put(3, "three");
        System.out.println(hashMap);
        Random random=new Random();
        int key=1+ random.nextInt(6);
        System.out.println("key=" + key);
        for (Integer x: hashMap.keySet()) {
            if(x>=key)
            {
                System.out.println(x + " " + hashMap.get(x));
            }
        }
    }
}
