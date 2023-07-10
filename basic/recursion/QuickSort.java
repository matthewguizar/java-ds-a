package basic.recursion;

public class QuickSort {
    public static void main(String[] args) {
        //using a starting point called the pivot usually at the end and a temp variable
        // use two other variables to keep track of an element and the element before it starting first element and before first element
        //comparing the most left element to pivot to check if it is smaller and right most variable only moves to next
        //index when left most variable is smaller, when larger it stays
        //if left most variable is larger than pivot it is ignored and moves on to next element (right variable stays)
        //if left most variable is smaller than pivot, then we swap right index with left with use of temp variable
        // (right variable shifts to swap)
        //repeats until left most variable reaches pivot
        //right most variable moves to next index and swaps with pivot using temp variable
        //to get all on right side smaller than all on left side and pivot not necessarily in the right order


        //next create two sections
        //first section contain all elements in array on right before pivot not including pivot
        //next section would be left side including elements after pivot not including pivot
        //keep track of beginning and ending of both sections and repeating above process
        //comparing each to pivot and switching when i(right most) and j(left most) when pivot is larger than j (left most)

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array)
        {
            System.out.print(i + " ");
        }

    }

    //moves smaller elements to left of a pivot
    //recursively divide array in 2 partitions
    //runtime = best case O(n log(n)
    //          average case O(n log(n))
    //          worst case O(n^2) if already sorted

    //space  = O(log(n)) due to recursion

    private static void quickSort(int[] array, int start, int end)
    {
        if (end <= start) return; //base case

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end)
    {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1 ; j++)
        {
            if (array[j] < pivot)
            {
                i++;
                int temp = array[i];
                array[i] =  array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] =  array[end];
        array[end] = temp;

        return i;
    }

}
