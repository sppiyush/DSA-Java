// Java program to demonstrate mod() method of BigInteger
// Importing the required Big Integer Library
import java.math.BigInteger;

public class BigIntMod
{

    public static void main(String[] args)

    {
        // Creating 2 BigInteger objects
        BigInteger b1, b2;

        b1 = new BigInteger("321456");
        b2 = new BigInteger("31711");

        // apply mod() method
        BigInteger result = b1.mod(b2);

        // print result
        System.out.println("Result of mod divison of " + b1 + " and " + b2 + " is " + result);
    }

    
}


