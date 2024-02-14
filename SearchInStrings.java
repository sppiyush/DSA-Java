// Searching a particular character in the string 

public class SearchInStrings
{
    // Function for searching a character inside a string 
    static boolean search(String str , char target)
    {
        // Base Condition
        if(str.length() == 0)
        {
            return false;
        }

        for(int i = 0; i < str.length(); i++)
        {
            if(target == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        String name = "Piyush"; // Input the string 
        char target = 'u';    // Input the target charcter that you want to search 
        System.out.println(search(name,target));
    }
}