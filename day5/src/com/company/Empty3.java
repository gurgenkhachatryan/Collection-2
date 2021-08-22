package com.company;

import java.util.HashMap;
import java.util.Iterator;

public class Empty3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(2, "two");
        hashMap.put(1, "one");
        hashMap.put(3, "three");
        System.out.println(hashMap);
     //   System.out.println(hashMap.keySet());
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != null) {
                System.out.print("is not empty");
                return;
            } else {
                System.out.print("is empty");
            }

        }

    }
}
