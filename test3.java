import java.util.*;
class even_odd
{
    void sum(int a)
    {
        if(a%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
         System.out.println("The number is odd");
        }
    }
}

class test3
{
    static 
    {
        System.out.println("Hello");
    }
     static void display()
    {
        System.out.println("One");
    }
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n=obj.nextInt();
        even_odd obj1=new even_odd();
        obj1.sum(n);/* */
        display();
        Demo.show();
    }
}

class Demo
{
    static void show()
    {
        System.out.println("two");
    }
}