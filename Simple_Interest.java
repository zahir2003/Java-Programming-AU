import java.io.*;
import java.util.*;
//import java.lang.*;
class Bank
{
    float p;
    float r;
    float t;
    void enter()
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter amount : ");
            p=sc.nextFloat();
            System.out.print("Enter time : ");
            t=sc.nextFloat();
            System.out.print("Enter interest : ");
            r=sc.nextFloat();
    }
    void total()
    {
     Interest obj1=new Interest();
     obj1.cal(p,r,t);
    }
}

class Interest
{
    void cal( float p1,float r1,float t1)
    {
         float in=(p1*r1*t1)/100;

        System.out.println("Simple interest is="+in);
    }
}

public class Simple_Interest
{
    public static void main(String [] args) throws IOException
    {
        Bank obj = new Bank();
        obj.enter();
        obj.total();
    }
}