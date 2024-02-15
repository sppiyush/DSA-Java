import java.util.Arrays;
public class SearchIn2DArray
{
    static int[] search(int[][] arr , int target)
    {
        for(int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                if(arr[row][col] == target)
                {
                    return new int[]{row,col}; // Initializing the array using new int[]
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main (String[] args)
    {
        int[][] arr ={ {23,4,1},
                       {18,12,3,9},
                       {78,99,34,56},
                       {18,12}
        };
        int target = 34;
        int[] ans = search(arr,target); //format of return value {row,column}
        System.out.println(Arrays.toString(ans));
    }
}