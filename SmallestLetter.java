/* 744. Find Smallest Letter Greater Than Target --> https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/ (Easy)
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

lexicographically - It refers to the order in which words or sequences are arranged based on the order of their alphabetical characters. 
In other words, it involves comparing elements character by character, just like how words are organized in a dictionary.
*/ 

public class SmallestLetter
{
    static char smallestLetter(char[] letters , char target)
    {
        int start = 0;
        int end = letters.length - 1;

    while(start <= end)
    {
        int mid = start + (end - start) / 2;
        
        if(target < letters[mid])
        {
            end = mid - 1;
        }

        else
        {
            start = mid + 1;
        }         
        
    }
    return letters[start % letters.length] ;
            
    }

    public static void main(String[] args)
    {
        char[] letters ={'c','f','j'};
        char target = 'k';
        char ans = smallestLetter(letters,target);
        System.out.println(ans);
    }
       
}
