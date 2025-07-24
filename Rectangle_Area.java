import java.util.*;
import java.io.*;
public class Rectangle_Area 
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter lenght : ");
        float len=scan.nextFloat();
        System.out.print("Enter width : ");
        float wid=scan.nextFloat();
        area ob = new area(len, wid);
        float ans=ob.cal_area();
        System.out.println("The area of the Rectangle is = "+ans);
    }
    
}

class area
{
   float l,w;
   area(float l1,float w1)
   {
    l=l1;
    w=w1;
   }
   
   float cal_area()
   {
    float a=l*w;
    return a;
   }
}