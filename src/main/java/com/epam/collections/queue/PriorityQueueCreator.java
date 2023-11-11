package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> hehe = new PriorityQueue<>(Comparator.reverseOrder());



        hehe.addAll(firstList);
        hehe.addAll(secondList);




        return hehe;
    }
}
