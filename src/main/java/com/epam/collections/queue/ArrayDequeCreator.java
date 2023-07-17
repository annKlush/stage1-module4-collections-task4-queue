package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(firstQueue.poll());
        arrayDeque.offer(firstQueue.poll());


        arrayDeque.offer(secondQueue.poll());
        arrayDeque.offer(secondQueue.poll());
        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            firstQueue.offer(arrayDeque.pollLast());
            arrayDeque.offer(firstQueue.poll()); // Add the top card from Player 1's queue to the ArrayDeque
            arrayDeque.offer(firstQueue.poll()); // Add the next card from Player 1's queue to the ArrayDeque

            secondQueue.offer(arrayDeque.pollLast());
            arrayDeque.offer(secondQueue.poll()); // Add the top card from Player 2's queue to the ArrayDeque
            arrayDeque.offer(secondQueue.poll()); // Add the next card from Player 2's queue to the ArrayDeque

        }

        return arrayDeque;
    }
}