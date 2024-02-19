// Find the floor of the number i.e. Greatest element in an array smaller than or equal to the target number 
public class Floor
{
    static int floor(int[] arr,int target)
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
        return end;
        
    }
    public static void main(String[] args)
    {
        int[] arr = {23,45,89,100,102,120,123};
        int target = 24;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
}