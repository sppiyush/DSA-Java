// Java program to find the first digit of the number 

import java.util.Scanner;
public class FirstDig {
    public static int firstnum(int n)
    {
        while(n > 10)
        {
            n = n / 10;
        }
        return n;
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n = s.nextInt();
        System.out.println(firstnum(n));
    }
        
}

