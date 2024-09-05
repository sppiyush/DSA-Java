
// importing the Java BigInteger Library
import java.math.BigInteger;

public class FibonaBigInt {
    public static void main(String[] args)
    {
        int n = 100; // Number of Fibonacci numbers to compute
        // Creating a new BigInteger array object fib
        BigInteger[] fib = new BigInteger[n];
        // Initializing the first two pre known fibonacci numbers of the array 
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;

        // Iteratively calculating the rest of the fibonacci numbers 
        for (int i = 2; i < n; i++)
        {
            fib[i] = fib[i-1].add(fib[i-2]);
        }
        
        // Now  it iterates through all the fibo numbers and prints all the values to console
        for (int i = 0; i < n; i++)
        {
            System.out.println(fib[i]);
        }
    }
    
}
