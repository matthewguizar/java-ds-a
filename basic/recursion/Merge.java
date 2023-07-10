package basic.recursion;

public class Merge {

    /*
        recursively divide an array in 2, sort, recombine
        runtime = O(n log n)
        space = O(n)

        pass in an array, that  gets split in two which are sub-arrays/copies of the original.
        then these sub-arrays are each split into two more sub-arrays
        this continues until each sub-array is a size of one
        once this is achieved then each element is compared to be in order from smallest to largest
        using copies to move elements
        but starts at left side branch and works its way to the right side branch

       O(n log n) quasilinear time
       faster than insertion, selection, bubble sort but creating sub-arrays uses more space
       while insertion, selection, and bubble use constant space

     */

    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array);

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array)
    {
        int length = array.length;
        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //left
        int j = 0; //right

        for (; i < length; i++)
        {
            if (i < middle)
            {
                leftArray[i] = array[i];
            }
            else
            {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[]rightArray, int[]array)
    {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check conditions for merging
        while (l < leftSize && r < rightSize)
        {
            if (leftArray[l] < rightArray[r])
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else
            {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while ( l < leftSize)
        {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize)
        {
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }
}
