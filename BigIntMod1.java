// Mod of two BigInteger having same values 
//Importing the required BigIntMod library
import java.math.BigInteger;


public class BigIntMod1 {
    public static void main(String[] args)
    {
        BigInteger b1 , b2;
        b1 = new BigInteger("3214556");
        b2 = new BigInteger("3214556");

        BigInteger result = b1.mod(b2);

        System.out.println("Value of " + b1 + " mod " + b2 + " is this :- " + result);



    }
    
}
