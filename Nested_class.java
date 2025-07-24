import java.util.*;
class CPU
{
    float price;
    Scanner sc=new Scanner(System.in);

   CPU(float p)
   {
    price=p;
   }

   class processor
   {
    String cores;
    String manufacturer;

    void getCache()
    {
        System.out.println("Enter Cores= ");
        cores=sc.nextLine();
        System.out.println("Enter Manufacturer name= ");
        manufacturer=sc.nextLine();

        System.out.println("The core is= "+cores);
        System.out.println("The Manufacturer name is="+manufacturer);
    }
   }

   protected class RAM
    {
        String  memory;
        String clock;

        void getClockSpeed()
        {
            System.out.println("Enter memory= ");
            memory=sc.nextLine();
            System.out.println("Enter clock speed=");
            clock=sc.nextLine();

            System.out.println("Memory is = "+memory);
            System.out.println("Clock speed is = "+clock);
        }
   }
}
public class Nested_class 
{
    public static void main(String [] args)
    {
        CPU obj=new CPU(2000);
        CPU.processor obj1=obj.new processor();
        CPU.RAM obj2=obj.new RAM();
        obj1.getCache();
        obj2.getClockSpeed();
    }
}
