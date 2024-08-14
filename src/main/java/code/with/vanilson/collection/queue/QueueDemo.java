package code.with.vanilson.collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueueDemo
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-14
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Object> queue = new ArrayDeque<>();
        Queue<String> stringQueue = new LinkedList<>();
        Queue<String> stringPriorityQueue = new PriorityQueue<>();

        // Add elements to the queue
        queue.add(" ");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Add elements to the string queue
        stringQueue.add("apple");
        stringQueue.add("banana");
        stringQueue.add("cherry");
        stringQueue.add("date");
        stringQueue.add("elderberry");

        // Add elements to the string priority queue
        stringPriorityQueue.add("apple");
        stringPriorityQueue.add("banana");
        stringPriorityQueue.add("cherry");
        stringPriorityQueue.add("date");
        stringPriorityQueue.add("elderberry");

        // Print the queue
        System.out.println("Queue: " + queue);
        System.out.println("String queue: " + stringQueue);
        System.out.println("String priority queue: " + stringPriorityQueue);

        //  Using peek queue to retrieve the head of the queue
        System.out.println("Queue: " + queue.peek());

        // Retrieves and removes
        System.out.println("Queue: " + queue.poll());

        // add on head the queue
        System.out.println("Queue: " + queue.add(23));

        // Print the queue
        System.out.println("Queue: " + queue);

    }
    /**
     * Queues use principle FIFO (first in, first out) that means the first element to entries is the first to be out.
     * Queues allow duplicate entries elements.
     */
}