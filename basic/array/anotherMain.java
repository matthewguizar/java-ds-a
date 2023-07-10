package basic.array;

import java.util.ArrayList;
import java.util.LinkedList;

public class anotherMain {
    public static void main(String[] args) {
        //linked list vs array list (array list seem more versatile)
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++)
        {
            linkedList.add(i);
            arrayList.add(i);
        }

        startTime = System.nanoTime();

        //linkedList.get(0);
        //linkedList.get(500000); //slower compared to array
        //linkedList.get(999999);


        //linkedList.remove(0); //quicker than array
        //linkedList.remove(500000); slow because must navigate to middle
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");


        startTime = System.nanoTime();

//        arrayList.get(0);
        //arrayList.get(500000); //get is faster with array compared to linked list
        //arrayList.get(999999);


        //arrayList.remove(0); //slower because it must shift n elements
        //arrayList.remove(500000); //not as slow because its half of the array
        arrayList.remove(999999); //less time since its toward the end
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
