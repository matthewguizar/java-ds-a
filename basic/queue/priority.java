package basic.queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class priority {
    public static void main(String[] args) {
        //fifo struct sorted from high priority to the lowest priority

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder()); // with doubles, they are in ascending order

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }
    }
}
