// Java Program showing exception when BigInteger passed as a parameter is less than zero
// Importing the required value

import java.math.BigInteger;
public class BigIntMod2 {
    public static void main(String[] args) 
    {
        // Creating 2 BigInteger objects
        BigInteger b1 , b2;

        b1 = new BigInteger("2432434");
        b2 = new BigInteger("-232423");

        // apply mod() method
        BigInteger result = b1.mod(b2);

        // print result
        System.out.println("Result of mod operation between " + b1 + " and " +
        b2 + " equal to " + result);
        
    }
    
}
