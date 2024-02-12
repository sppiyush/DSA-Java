// We will check whether a particular word is in uppercase or in lowercase 
import java.util.Scanner;


public class Alphabet
{
    public static void main (String[] args)
    {
        System.out.println("Word :- ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);  // trim() is used to remove extra space , charAt(0) will check the index at 0th position 

         if(ch >= 'a' && ch <= 'z')
         {
            System.out.println("Lowercase");
         }

         else
         {
            System.out.println("Uppercase");
         }
    }
}