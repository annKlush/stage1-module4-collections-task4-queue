package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> mergedList = mergeLists(firstList, secondList);
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(mergedList);

        return priorityQueue;
    }

    private List<String> mergeLists(List<String> firstList, List<String> secondList) {
        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);
        return mergedList;
    }
}
