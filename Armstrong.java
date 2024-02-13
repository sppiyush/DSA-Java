// Check Armstrong number 

/*
 * An Armstrong number (also known as a narcissistic, pluperfect, or pluperfect digital invariant number) is a number that is the sum of its own digits each raised to the power of
 *  the number of digits.In other words, an n-digit number is an Armstrong number if the sum of its individual digits, each raised to the power of n, is equal to the original number.
 * 
 153 is three digit armstrong number since 1^3 + 5^3 + 3^3 = 153  and 1634 is a 4 digit armstrong number that means 1^4 + 6^4 + 3^4 + 4^4 = 1634*/

import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number :- ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;

        while(n > 0)
        {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        if(sum == original)  // return sum == original;
        {
            return true;
        }
        return false;
    }
}

/*
 * for(int i = 100; i < 1000; i++)
 * {
*    if(isArmstrong(i){
    System.out.println(i + " ");  --> Write this psvm , you will be able to get three digit Armstrong number.
}
 * 
 * }
 */