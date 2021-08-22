package com.company.Workday3;

import java.util.Iterator;
import java.util.PriorityQueue;

public class ComparePrQueue17 {
    public boolean compPrQueue() {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(15);
        pq1.add(25);
        pq1.add(50);
        pq1.add(5);
        pq1.add(29);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(15);
        pq2.add(25);
        pq2.add(50);
        pq2.add(5);
        pq2.add(22);

        Iterator<Integer> iterator1 = pq1.iterator();
        Iterator<Integer> iterator2 = pq2.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().compareTo(iterator2.next()) != 0) {
                return false;
            }
        }
        return true;
    }
}
