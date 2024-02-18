// First checking whether a particular array is in ascending or in descending order and then applying Binary Search 

public class BS
{
    static int orderAgnosticBS(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length - 1;
        
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

    public static void main(String[] args)
    {
        int[] arr ={99,80,75,22,11,10,5,2,-3};
        int target = 11;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
       
}
