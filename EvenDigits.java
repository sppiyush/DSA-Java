/* Link - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/ 
 * 
 * 1295. Find Numbers with Even Number of Digits (Easy)
 * Example 1:-
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
*/

public class EvenDigits
{
    static int findNumbers(int[] nums)
    {
        int count = 0;
        //This is enhanced for loop
        for(int num : nums)    //for (int i = 0; i < nums.length; i++) {
                               //int num = nums[i];
        {
            if(even(num)) // calling the even function
            {
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digits or not 
    static boolean even(int num)
    {
        int numberOfDigits = digits(num); // caling the digits method
        if(numberOfDigits % 2 == 0)   // or you can write return numberOfDigits % 2 == 0;
        {
            return true;
        }
        return false;
    }
    //count number of digits in a number 
    static int digits(int num)
    {
        int count = 0;
        while (num > 0)
        {
            count++;
            num = num / 10; // num /= 10
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] nums = {12,345,2,6,7896,98};
        System.out.println(findNumbers(nums));
    }

}