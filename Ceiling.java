// Find the ceiling of the number i.e. Smallest element in an array greater than or equal to the target number 
public class Ceiling
{
    static int ceiling(int[] arr,int target)
    {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        if (arr[start] < arr[end])
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
            if(arr[mid] == target)
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
        return start;
        
    }
    public static void main(String[] args)
    {
        int[] arr = {23,45,89,100,102,120,123};
        int target = 24;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }
}