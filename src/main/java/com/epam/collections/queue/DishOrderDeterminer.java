package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishOrder = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // Initialize the queue with dish numbers
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.offer(i);
        }

        // Process the dishes until the queue is empty
        while (!queue.isEmpty()) {
            // Eat everyDishNumberToEat dish
            for (int i = 1; i < everyDishNumberToEat; i++) {
                // Remove and add the dish back to the queue
                int dish = queue.poll();
                queue.offer(dish);
            }

            // Eat the current dish and remove it from the queue
            int dish = queue.poll();
            dishOrder.add(dish);
        }

        return dishOrder;
    }
}
