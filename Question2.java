import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
       Scanner obj;
       obj=new Scanner(System.in);
        System.out.println("Enter the sales amount=");
        float sales=obj.nextFloat();
        float salary=6500;
        float total;

        if(sales<=500)
        {
           total=salary+((sales*5)/100);
           System.out.println("The total salary is="+total);
        }

        else if(sales>500 && sales<=2000)
        {
            total=salary+35+((sales*10)/100);
            System.out.println("The total salary is="+total);
        }

        else if(sales>2000 && sales<=5000)
        {
            total=salary+185+((sales*12)/100);
            System.out.println("The total salary is="+total);
        }

        else if(sales>5000)
        {
            total=salary+((sales*12)/100);
            System.out.println("The total salary is="+total);
        }

    }
}
