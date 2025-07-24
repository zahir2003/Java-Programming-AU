//import java.util.*;
class one
{
static int a;
one(int a)
{
    this.a=a;
}
static void display()
{
    System.out.println(a);
}
}
class PractiseQ
{
    public static void main(String [] args)
    {
      one obj =new one(10);
      one.display();
    }
}
