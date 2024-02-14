/* Leetcode 2149. Rearrange Array Elements by Sign (Medium level question)
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

Ex :- Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  
 */
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrSign {

    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        // Separate positive and negative numbers into two separate lists
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }

        // Merge positive and negative lists while preserving order
        int i = 0, j = 0, k = 0;
        while (i < positive.size() && j < negative.size()) {
            nums[k++] = positive.get(i++);
            nums[k++] = negative.get(j++);
        }

        // Copy any remaining positive numbers
        while (i < positive.size()) {
            nums[k++] = positive.get(i++);
        }

        // Copy any remaining negative numbers
        while (j < negative.size()) {
            nums[k++] = negative.get(j++);
        }

        return nums;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {1, -3, 2, -4, -1, 4};
        int[] result = rearrangeArray(nums);

        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}
