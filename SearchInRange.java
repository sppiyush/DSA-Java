// Search a particular element within a range of indexes in the given array 

public class SearchInRange
{
    static int linearSearch(int[] arr , int target , int start , int end)
    {
        // Base Condition
        if(arr.length == 0)
        {
            return -1;
        }

        // run a for loop
        for(int index = start; index <= end ; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] array = {18,12,-7,3,14,28};
        int target = 3;
        System.out.println(linearSearch(array,target,1,4)); // Printing the value
    }
}