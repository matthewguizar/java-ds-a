package basic.linked;
import java.util.LinkedList;

public class LinkdList<S> {
    //array have difficulty adding and deleting items
    public static void main(String[] args) {
        //basic.linked list have no index but use pointers and are bad at searching

        LinkedList<String> linked = new LinkedList<String>();

//        basic.linked.push("A"); // push to be treated like a basic.stack
//        basic.linked.push("B");
//        basic.linked.push("C");
//        basic.linked.push("D");
//        basic.linked.push("F");

        linked.offer("A"); //to be treated as a basic.queue use offer
        linked.offer("B");
        linked.offer("C");
        linked.offer("D");
        linked.offer("F");

        linked.add(4, "E");
        System.out.println(linked);
        linked.remove("E");
        System.out.println(linked.indexOf("F"));

        //checks the first and last of list - head / tail
        System.out.println(linked.peekFirst());
        System.out.println(linked.peekLast());

        // changing head and tail
        linked.addFirst("0");
        linked.addLast("G");

        //removing head and tail but storing them in variables to keep information
        String first = linked.removeFirst();
        String last = linked.removeLast();


        /*
        to remove head use poll
        basic.linked.poll();
        basic.linked.pop();
        */

        System.out.println(linked);

    }
}
