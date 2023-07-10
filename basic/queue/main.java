package basic.queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>(); //basic.queue is an interface NOT A CLASS!!

        System.out.println(queue.isEmpty());


        //enqueue
        queue.offer("Name");
        queue.offer("Another");
        queue.offer("String");
        queue.offer("Azul");

        System.out.println(queue.size());
        System.out.println(queue.contains("Azul")); //does not show position
        queue.poll();//dequeues

        System.out.println(queue.peek());

        //used in basic.linked lists, priority queues, breadth-first search
    }
}
