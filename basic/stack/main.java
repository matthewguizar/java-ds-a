package basic.stack;
import java.util.Stack;

public class main {

    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Item-name");
        stack.push("another-item");
        stack.push("name-of-item");

        String name = stack.pop(); // removes the top
        // saving as variable is a way to keep the information

        System.out.println(stack.peek()); // checks the top most item
        System.out.println(stack.search("Item-name")); //to search for item
        //returns -1 if item is not found

        //stacks can run out of memory when adding items to basic.stack


        System.out.println(stack);
    }
}
