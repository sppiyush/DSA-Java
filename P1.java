// Java code for using 'this' keyword to refer current class instance variables
public class P1 {
    // Instance variables
    int a;
    int b;

    //Paramaterized constructor
    P1(int a , int b)
    {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args)
    {
        P1 object = new P1(10,20);
        object.display();
    }

    
}
