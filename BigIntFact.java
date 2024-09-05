// Q:- Write a Java program to find the large factorials using BigInteger 

//Import the required libraries 
import java.math.BigInteger;
import java.util.Scanner;

//Create a public class which will keep all the factorial codes 
public class BigIntFact
{
    //Create a function named factorial to calculate the factorial of N (we will convert N to BigInt later)
    static BigInteger factorial(int N) 
    {
        //Initialize the result first 
        BigInteger f = new BigInteger("1");  // Or BigInteger.ONE 

        // Multiple f with 2,3,  ...N
        for(int i = 2; i <= N; i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }

        return f;

    }
    
    // Now run the driver function
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Asking the number to find the factorial 
        System.out.print("Input the number :- ");
        int num = sc.nextInt();

        System.out.println("Factorial of the given number :-  " + num + " is " + factorial(num));
    }
}


/* The "time complexity" of this algorithm is O(N) because the loop runs from 2 to N, performing (N - 1) multiplications.
Each multiplication involves BigInteger arithmetic, which can grow more complex as N increases, but for simplicity, the number of iterations is linear with respect to N.

Space Complexity:
The space complexity is O(1) if we disregard the space required for storing the result (BigInteger variable f). 
However, since BigInteger consumes space proportional to the number of digits in the result, it grows as O(log(N!)). */ 