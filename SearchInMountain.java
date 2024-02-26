// Leetcode - https://leetcode.com/problems/find-in-mountain-array/


/* Approach - 1. Find the peak element 
              2. Binay Search in ascending array 
              3. If not found,binary search in the descending array 
 * 
 */
public class SearchInMountain
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    public static int search(int[] arr, int target)
    {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if(firstTry != -1)
        {
            return firstTry;
        }
        //try to search in the second half 
        return orderAgnosticBS(arr,target,peak + 1, arr.length -1);
    }

    static int orderAgnosticBS(int[] arr , int target,int start,int end)
    {
        
        //finding whether the array is in ascending or in descending order 
        boolean isAsc;
        if(arr[start] < arr[end])   // OR the whole "if statement" can be written as boolean isAsc = arr[start] < arr[end];
        {
           isAsc = true;
        }
        else
        {
           isAsc = false;
        }

    while(start <= end)
    {
        int mid = start + (end - start) / 2;

        if (arr[mid] == target)
        {
            return mid;
        }
            
        if(isAsc)
        {
            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else 
            {
                start = mid + 1;
            }
        }

        else
        {
            if(target > arr[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }         
        }
    }
    return -1;
            
    }
    
    
    
    public static int peakIndexInMountainArray(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start < end)
        {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
            {

                end = mid;
            }
            else
            {
                
                start = mid + 1; 
            }
        }
        return start; 
    }
}