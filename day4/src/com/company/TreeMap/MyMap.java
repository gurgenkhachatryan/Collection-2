package com.company.TreeMap;

import java.util.LinkedList;

public class MyMap<K, V> {
    int capacity = 16;

    LinkedList<Entry<K, V>>[] array = new LinkedList[capacity];

    public void put(K key, V value) {
        int count = 0;
        int index = key.hashCode() % capacity;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                count++;
            }
        }
        if (count <= capacity * 0.25) {
            capacity *= 2;
            LinkedList<Entry<K, V>>[] newArray = new LinkedList[capacity];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    for (int j = 0; j < array[i].size(); j++) {
                        int newIndex = array[i].get(j).key.hashCode() % capacity;
                        if (newArray[newIndex] == null) {
                            newArray[newIndex] = new LinkedList<>();
                            newArray[newIndex].add(array[i].get(j));
                        } else
                            newArray[newIndex].add(array[i].get(j));
                    }
                }
            }
            array = newArray;
        }


        Entry<K, V> entry = new Entry<>(key, value);

        if (array[index] == null) {
            array[index] = new LinkedList<>();
            array[index].add(entry);
            return;
        }
        //  Entry<K, V> current;
        for (int i = 0; i < array[index].size(); i++) {
            //   current = array[index].get(i);
            if (array[index].get(i).key.equals(key)) {
                //if (current.key.equals(key)) {
                array[index].get(i).value = entry.value;
                return;
            }
            array[index].add(entry);
            return;
        }
    }

    public  void   get(K key)
    {

        int index=key.hashCode()%capacity;
        for(int i=0;i<array[index].size();i++)
        {
            if(array[index].get(i).key.equals(key))
            {
                System.out.println(array[index].get(i).value);
                return;
            }
        }
        System.out.print("invalid key");
    }
}
