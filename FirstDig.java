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

/*
 * The time complexity of the given Java program is O(log₁₀(n)).

Explanation:
The method firstnum(int n) reduces n by dividing it by 10 in each iteration of the while loop. This operation continues until n becomes less than or equal to 10, 
effectively removing one digit from the number in each iteration.
The number of times you can divide a number n by 10 until it becomes a single digit is proportional to the number of digits in n. The number of digits in a number n 
is approximately log₁₀(n).
Thus, the time complexity is O(log₁₀(n)), where n is the input number.

Space Complexity:
The space complexity is O(1) since no additional space is required except for a few variables used in the method.
 */



/*
 * import java.util.Scanner;

public class FirstNum{
    public static void main(String[] args)
    {
        System.out.print("Enter the number :- ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(FirstDigit(n));
    }
    
    public static int FirstDigit(int n)
    {
        double power = Math.log10(n);
        int p = (int) power;
        int a = (int) Math.pow(10,p);
        int ans = n / a;
        return ans;
    }
}


The time complexity of the given Java code is O(1) (constant time). Since all the operations in the code are performed in constant time, the overall time complexity is O(1).

The space complexity is also O(1) since the program only uses a fixed amount of extra space (variables power, p, a, and ans), regardless of the size of the input.
 */