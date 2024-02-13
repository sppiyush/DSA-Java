// Find the maximum element in between a particular range in Java 
public class Max
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,9,3,0,234,980};
        System.out.println(maxRange(arr,1,3));
    }

    static int maxRange(int[] arr , int start , int end)
    {

        if(arr == null)
        {
            return -1;
        }
        
        int maxVal = arr[start];
        for(int i = start; i<=end;i++)
        {
            if(arr[i] > maxVal)
            {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}