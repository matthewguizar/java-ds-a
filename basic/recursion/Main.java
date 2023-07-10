package basic.recursion;

public class Main {
    /********
     *  Recursion: process of defining a problem or solution to a problem in terms of applying the result of a procedure
     *  to a procedure. A recursive method calls itself. can be a substitute for iteration. divide a problem into
     *  sub-problems of the same type as the original. Commonly used with advanced sorting algorithms and navigating
     *  trees
     *
     *  EASIER TO READ/WRITE AND DEBUG
     *
     *  BUT USES MORE MEMORY AND CAN BE SLOWER
     *******/

    public static void main(String[] args) {

        System.out.println(factorial(7));
        System.out.println(power(2, 8));
    }

    private static void walk(int steps)
    {
        if (steps < 1) return; //base case
        System.out.println("You take a step");
        walk(steps - 1); //recursive case
    }

    private static int factorial(int num)
    {
        if (num < 1) return 1; //base case
        return num * factorial(num - 1); //recursive case
    }

    private static int power(int base, int exponent)
    {
        if (exponent < 1) return 1; //base case
        return base * power(base, exponent - 1); //recursive case
    }

}
