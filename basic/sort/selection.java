package basic.sort;

public class selection {

    public static void main(String[] args) {
        //loops through array to find minimum value and moves it to beginning
        //by moving current value to temp and then putting minimum in correct spot
        //and moving temp value to the original spot of minimum value
        //repeating finding next minimum

        //search through an array and keep track of minimum value during each iteration.
        //at end of each iteration we swap variables

        //quadratic time

        int array[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

        selectionSort(array);

        for (int i : array)
        {
            System.out.print(i);
        }
    }

    private static void selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[min] > array[j]) //swapping sign gives
                {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }


}
