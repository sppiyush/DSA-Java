// Check whether the given sentence or the word is a pangram or not 
import java.util.*;
public class CheckPangram {
     static boolean isPangram(String s)
    {
        //Base Condition
        int n = s.length();
        if(n < 26)
        {
            return false;
        }

        //Creating an empty array 
        boolean visited[] = new boolean[26];
        for(int i = 0; i < n; i++)
        {
            char x = s.charAt(i);
            if(x >= 'a' && x <= 'z')
            {
                visited[x - 'a'] = true;
            }

            if(x >= 'A' && x <= 'Z')
            {
                visited[x - 'A'] = true;
            }
        }

        for(int i = 0; i < 26; i++)
        {
            if(visited[i] == false)
            {
                return false;
            }           
        }
        return true;

    }

    public static void main(String[] args)
    {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(s));
    }
    
}

/*
 * Time Complexity: As only a single loop will be used to iterate through the string to check for pangram, therefore the time complexity would be O(n), where n is the length of the given string. The other loop that must be used to check through the updated array would be constant.
   Auxiliary Space: As only a new array of size 26 is created so, it occupies O(26) space which is a constant.
 */