// Q - Find the nth fibonacci number

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Enter the value of n :- ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = 0;
        int i = 1;
        int count = 2 ; // since we already know the first two numbers which is 0 and 1

        while (count <= n)
        {
             int temp = i;
             i = i + p;
             p = temp;
             count++;
        }
        System.out.println("This is your fibonacci number :- " + i);
    }
}