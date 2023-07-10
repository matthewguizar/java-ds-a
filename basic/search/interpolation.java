package basic.search;

public class interpolation {
    //improvement over binary search best used for "uniformly" distributed data "guesses" where a value
    //be based on calculated probe results. if incorrect search area is narrowed and new probe is calculated

    //average: O(log(log(n)))
    //worst case: O(n) [values increase exponentially]
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);

        if (index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value)
    {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value<=array[high] && low <= high)
        {
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);

            System.out.println(probe);

            if (array[probe] == value)
            {
                return probe;
            }
            else if (array[probe] < value)
            {
                low = probe + 1;
            }
            else
            {
                high = probe - 1;
            }

        }
        return -1;
    }

}
