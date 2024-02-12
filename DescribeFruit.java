// Describe some prominent fruits

import java.util.Scanner;

public class DescribeFruit
{
       public static void main(String[] args)
       {
           //Take the input from the user 
           System.out.println("Input the fruit you love eating :- ");
           Scanner in = new Scanner(System.in);
           String fruit = in.next();

           switch (fruit)
           {
               case "Mango" :
                   System.out.println("King of fruits");
                   break;
               case "Apple" :
                   System.out.println("A sweet red fruit");
                   break;
               case "Orange" :
                   System.out.println("Round fruit");
                   break;
               case "Grapes" :
                   System.out.println("Small fruit");
                   break;    
               default:
                   System.out.println("Please enter a valid fruit");    
           }
       }
}

/*
 * You can also use enhanced switch statements 
 * switch(fruit)
 * {
 *    case "Mango" -> System.out.println("King of fruits")
 *    case "Apple" -> System.out.println("A sweet red fruit")
 *     .
 *     .
 *     .
 *    default -> System.out.println("please enter a valid fruit");
 * }
 */