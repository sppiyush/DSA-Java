// Q - Take three integers as an input from the user and find the largest among them 

import java.util.Scanner;

public class Largest
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the three numbers :- ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a ;
        if(b>max)
        {
            max = b;
        }

        if(c > max)
        {
            max = c;
        }

        System.out.println(max);
    }
}

/*
 * However we can also use Math.max() function to calculate the largest value
 * int max = Math.max(c,Math.max(a,b));
 * System.out.println(max);
 */