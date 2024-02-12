// Count the number of occurences of a particular digit in a number Ex:- 45857 - 5 occurs two times 

public class CountOcc
{
    public static void main(String[] args)
    {
        int n = 553575855;
        int count = 0;
        while(n>0)
        {
            int rem = n % 10;
            if(rem == 5)
            {
                count++;
            }
            n = n / 10; // n /= 10;
        }
        System.out.println(count);
    }
}