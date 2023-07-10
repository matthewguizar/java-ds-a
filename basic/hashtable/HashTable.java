package basic.hashtable;

import java.util.Hashtable;

public class HashTable {

    public static void main(String[] args) {

        /*
        Data structure that stores unique key values
        each key/value pair is known as an entry
        fast insertion, look up, deletion of key/value pairs
        not ideal for small data sets, great with large data sets

        hashing = takes a key and computes an integer (based on key and data type)
        in hashtable we use hash % capacity to calculate index number
        key.hashCode() % capacity = index

        bucket is when a collision occurs and index storage becomes similar to linked list

        runtime best: O(1)
                worst: O(n)


         */

        Hashtable<Integer, String> table = new Hashtable<>(10);
        Hashtable<String, String> string = new Hashtable<>(21);

        table.put(100, "spongebob");
        table.put(123, "patrick");
        table.put(321, "sandy");
        table.put(555, "squidward");
        table.put(777, "gary");

        string.put("100", "spongebob");
        string.put("123", "patrick");
        string.put("321", "sandy");
        string.put("555", "squidward");
        string.put("777", "gary");

//        table.remove(777);

        for (Integer key : table.keySet())
        {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }
        System.out.println("\n");

        for (String key : string.keySet())
        {
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + string.get(key));
        }

    }

}
