//Check whether a number is prime or not 

import java.util.Scanner;

public class IsPrime
{
    public static void main(String[] args) 
    {
        System.out.println("Input the number :- ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        
    }

    static boolean isPrime(int n)
    {
        //base condition
        if (n <= 1)
        {
            return false;
        }

        int c = 2;
        while(c * c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }

        if (c * c > n)     // we can also write this as "return c * c > n", this means either true will be returned or false will be returned
        {
            return true;
        }
        return false;
    }
}

/*
 * In a traditional approach to check for the primality of a number, you might iterate through divisors from 2 up to the square root of the number. 
 * This is because, beyond the square root, if a number has a divisor, it must also have a corresponding divisor that is less than the square root.
 * 
 * The given code uses a while loop with the condition c * c <= n to iterate through potential divisors (c) up to the square root of the input number.
 * However, instead of continuing until c reaches exactly the square root, the condition c * c <= n is used.

   The condition c * c > n is used to check whether the loop has iterated beyond the square root of n. If this condition is true, 
   it means the loop has checked all possible divisors up to the square root, and none of them evenly divides n.

   Therefore, if c * c > n is true, the function can conclude that the input number n is prime because it hasn't found any divisors within the specified range.

   In essence, this optimization allows the program to perform fewer iterations, 
   making the primality check more efficient by stopping as soon as it is logically possible to determine whether the number is prime or not.
 */