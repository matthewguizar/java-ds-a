package basic.array;

public class Main {
    public static void main(String[] args) {

        dynamic dynamic = new dynamic(5);

        dynamic.add("A");
        dynamic.add("B");
        dynamic.add("C");
        dynamic.add("D");
        dynamic.add("E");
        dynamic.add("F");
        //dynamic.insert(0, "Z");
       // dynamic.delete("A");
        System.out.println(dynamic.search("C"));
        System.out.println(dynamic.search("A"));

        System.out.println(dynamic.isEmpty());
        System.out.println(dynamic.size);
        System.out.println(dynamic.capacity);

        System.out.println(dynamic);




    }
}
