/*34. Find First and Last Position of Element in Sorted Array --> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/ (Medium)
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 * 
 * 
 * 
 * 
 */

public class FirstAndLastPosition
{

    public static int[] searchRange(int[] nums, int target) 
    {
        int[] result = {-1, -1};

        // Search for the leftmost occurrence
        result[0] = binarySearch(nums, target, true);

        // If the leftmost occurrence is not found, the rightmost won't be either
        if (result[0] == -1) 
        {
            return result;
        }

        // Search for the rightmost occurrence
        result[1] = binarySearch(nums, target, false);

        return result;
    }

    private static int binarySearch(int[] nums, int target, boolean findLeftmost) 
    {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) 
        {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) 
            {
                result = mid;

                // Adjust the search space based on whether we want to find the leftmost or rightmost occurrence
                if (findLeftmost) 
                {
                    end = mid - 1;
                } 
                else 
                {
                    start = mid + 1;
                }
            } 
            
            else if (nums[mid] < target) 
            {
                start = mid + 1;
            } 
            else 
            {
                end = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) 
    {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(nums, target);

        System.out.println("Starting Position: " + result[0]);
        System.out.println("Ending Position: " + result[1]);
    }
}
