package basic.sort;

public class insertion {
    //begin at index 1 and move value into temp variable and examine elements to left
    //and any larger element will be shifted to right, if less its stopped and put back or until out of elements to compare
    //next iteration is examining next index and repeating

    //after comparing elements to the left shift elements to the right to make room to insert a value
    //quadratic time O(n^2)
    //fewer steps than bubble sort
    // best case is O(n) compared to selection sort O(n^2)

    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 5, 4};
        insertionSort(array);

        for (int i : array)
        {
            System.out.print(i +  " ");
        }
    }

    private static void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int temp  = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp)
            {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }

}
