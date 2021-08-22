package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SortKeyList12 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println(arrayList);
        ArrayList<Integer> newArrayList = new ArrayList<>();
        int temp;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 1 + i; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j)) {
                    continue;
                }
            }
            for (int k = 0; ; k++) {
                newArrayList.add(k, arrayList.get(i));
            }

        }
        System.out.println(newArrayList);
    }

}
        //System.out.println(arrayList);

