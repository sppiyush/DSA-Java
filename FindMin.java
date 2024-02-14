// Find the minimum number in the array 

public class FindMin
{
    //assume arr.length !=0
    // return the minimum value in the array

    static int min(int[] arr)
    {
        int ans = arr[0];
        for(int i = 1; i < arr.length;i++)
        {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }
        }
        return ans; //returning the answer  
    }

    public static void main (String[] args)
    {
        int[] arr = {-2,5,8,40,607,45,0};
        System.out.println(min(arr)); // Printing the value
    }
}