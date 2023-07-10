package basic.sort;

public class bubble {
    //compares adjacent elements to see which one is larger-- larger is moved into a temp variable
    //while the smaller is switched into larger elements previous location and larger is moved to smaller elements location
    //repeated until larger number finds correct spot

    //O(n^2) = quadratic
    public static void main(String[] args) {
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[])
    {
        for (int i = 0; i < array.length - 1;  i++)
        {
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j+1]) //swap sign to flip order
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }
    }

}
