//import java.io.packa;

class A
{
  static int a;
  static int b;
A(int x,int y)
{
    a=x;
    b=y;
}
void number()
{
System.out.println("A value is="+a);
System.out.println("B value is= "+b);
}
static class check
{ 
    void compare()
    {
   if(a<b)
   {
    System.out.println("B is greater");
   }
   else
   {
    System.out.println("A is greater");
   }
}
}
}
public class Largest_number 
{
    public static void main(String [] args)
    {
        A obj=new A(20,30);
        A.check obj1=new A.check();
        obj.number();
        obj1.compare();
    }
    
}
