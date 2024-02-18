// Code for the binary search 

public class BinarySearch
{
    static int binarySearch(int[] arr , int target)
    {
        //return the index
        //return -1 if it does not exist 

        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            //find the middle element 

            int mid = start + (end - start) / 2; // might be possible that start + end may exceed the range of integers in java 
            if (target < arr[mid])
            {
                end = mid - 1;
            }

            else if (target > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                // ans found 
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {-18,-12,-4,-2,3,4,15,16,18,22,45,89};
        int target = 89;
        int ans = binarySearch(arr,target);
        System.out.println("Element is at index no. :- " + ans);
    }
}