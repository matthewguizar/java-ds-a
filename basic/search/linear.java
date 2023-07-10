package basic.search;



public class linear {
    public static void main(String[] args) {
        //bad for large data sets but useful for small to medium data sets O(n)
        //does not need to be sorted and useful for data structs that do not have random access

        int [] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 10);

        if (index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int [] array, int value)
    {

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
            {
                return i;
            }
        }
        return -1;
    }
}
